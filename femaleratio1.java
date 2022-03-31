import java.sql.Statement;
import java.sql.*; 

public class femaleratio1{
    class department{
        int male=0;
        int female=0;
    };
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employees";
        String user="root";
        String password="12Dec2000@";
        int[][] department = new int[9][2];

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT dept_no,gender FROM employees natural join dept_emp;");
            rs.next();
            
            while(rs.next()){

             
            switch(rs.getString(1)){
                case "d001" : if(rs.getString(2).equals("M")){
                    department[0][0]+=1;
                }
                else{
                    department[0][1]+=1;
                } break;
                case "d002" : if(rs.getString(2).equals("M")){
                    department[1][0]+=1;
                }
                else{
                    department[1][1]+=1;
                } break;
                case "d003" : if(rs.getString(2).equals("M")){
                    department[2][0]+=1;
                }
                else{
                    department[2][1]+=1;
                } break;
                case "d004" : if(rs.getString(2).equals("M")){
                    department[3][0]+=1;
                }
                else{
                    department[3][1]+=1;
                } break;
                case "d005" : if(rs.getString(2).equals("M")){
                    department[4][0]+=1;
                }
                else{
                    department[4][1]+=1;
                } break;
                case "d006" : if(rs.getString(2).equals("M")){
                    department[5][0]+=1;
                }
                else{
                    department[5][1]+=1;
                } break;
                case "d007" : if(rs.getString(2).equals("M")){
                    department[6][0]+=1;
                }
                else{
                    department[6][1]+=1;
                } break;
                case "d008" : if(rs.getString(2).equals("M")){
                    department[7][0]+=1;
                }
                else{
                    department[7][1]+=1;
                } break;
                case "d009" : if(rs.getString(2).equals("M")){
                                      department[8][0]+=1;
                                       } 
                                else{
                                 department[8][1]+=1;
                                  } break;
                default: continue;

            }     

                    }
                               
            con.close();
        } 
 
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("The female to male ratio :\n"+"In department no d001: "+(float)department[0][1]/department[0][0]);
        System.out.println("In department no d002: "+(float)department[1][1]/department[1][0]);
        System.out.println("In department no d003: "+(float)department[2][1]/department[2][0]);
        System.out.println("In department no d004: "+(float)department[3][1]/department[3][0]);
        System.out.println("In department no d005: "+(float)department[4][1]/department[4][0]);
        System.out.println("In department no d006: "+(float)department[5][1]/department[5][0]);
        System.out.println("In department no d007: "+(float)department[6][1]/department[6][0]);
        System.out.println("In department no d008: "+(float)department[7][1]/department[7][0]);
        System.out.println("In department no d009: "+(float)department[8][1]/department[8][0]);             
    }
}
