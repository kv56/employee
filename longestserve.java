import java.sql.Statement;
import java.sql.*;

public class longestserve {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employees";
        String user="root";
        String password="12Dec2000@";
        int max=0;
        int emp=0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select emp_no,datediff(to_date,from_date) as df from dept_emp");

           while(rs.next()){
                if(rs.getInt(2)>max){
                    max=rs.getInt(2);
                    emp=rs.getInt(1);

                }

            }                    
            con.close();
        } 
 
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("The employee with emp_no :"+emp+"  had worked  "+max+" days");
    }
}