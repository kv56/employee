import java.sql.Statement;
import java.sql.*; 
import java.util.*;

public class femaleratio2{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employees";
        String user="root";
        String password="12Dec2000@";
        HashMap<String,int[]> d= new HashMap<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT dept_no,gender FROM employees natural join dept_emp");
            while(rs.next()){
                String key= rs.getString(1);
                if(rs.getString(2).equals("M")){
                    if(d.containsKey(key)){
                    int[] A =d.get(key);
                    A[0]+=1;
                    d.replace(key.trim(),A);}
                    else{
                        d.put(key.trim(),new int[2]);
                        int[] A =d.get(key);
                        A[0]+=1;
                        d.replace(key.trim(),A);
                    }
                }
                else{
                    if(d.containsKey(key)){
                    int[] A =d.get(key);
                    A[1]+=1;
                    d.replace(key,A);
                    }
                    else{
                        d.put(key.trim(),new int[2]);
                        int[] A =d.get(key);
                        A[1]+=1;
                        d.replace(key.trim(),A);
                    }

                }
                    }              
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("dept_no"+" Male"+" Female"+" (F/M)Ratio\n");
    for(String k : d.keySet()){
        System.out.println(k+" "+d.get(k)[0] +" "+ d.get(k)[1]+" "+(float)d.get(k)[1]/d.get(k)[0]);
    }            
    }
}
