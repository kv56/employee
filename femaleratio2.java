import java.sql.Statement;
import java.sql.*; 
import java.util.*;

public class femaleratio2{
   
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employees";
        String user="root";
        String password="12Dec2000@";
        HashMap<String,int[]> d= new HashMap<String,int[]>();
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT dept_no,gender FROM employees natural join dept_emp;");
            int arr[]={0,0};
            d.put("d001",arr);
            d.put("d002",arr);
            d.put("d003",arr);
            d.put("d004",arr);
            d.put("d005",arr);
            d.put("d006",arr);
            d.put("d007",arr);
            d.put("d008",arr);
            d.put("d009",arr);
           int x,y; 
            while(rs.next()){

                if(rs.getString(2).equals("M")){
                    x=d.get(rs.getString(1))[0] ;
                    y=d.get(rs.getString(1))[1] ;
                    arr[0]=x+1;
                    arr[1]=y;
                    d.put(rs.getString(1),arr);
                }
                else{
                    x=d.get(rs.getString(1))[0] ;
                    y=d.get(rs.getString(1))[1] ;
                    arr[0]=x;
                    arr[1]=y+1;
                    d.put(rs.getString(1),arr);
                }


                    }
                               
            con.close();
        } 
 
        catch (Exception e) {
            e.printStackTrace();
        }
    for(String k : d.keySet()){
        System.out.println(d.get(k)[0] +" "+ d.get(k)[1]);
    }            
    }
}

