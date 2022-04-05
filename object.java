package p1;
import java.util.Date;
public class ratio {
    public class employee{
        int emp_no;
        Date birth_date;
        String first_name;
        String last_name;
        char gender;
        Date hire_date;

        public employee(int emp_no,Date birth_date,String first_name,String last_name,char gender,Date hire_date){
            this.emp_no=emp_no;
            this.birth_date=birth_date;
            this.first_name=first_name;
            this.last_name=last_name;
            this.gender=gender;
            this.hire_date=hire_date;
        }
    }

    public class dept_emp{
        int emp;
        String dept_no;
        Date from_date;
        Date to_date;

        public dept_emp(int emp,String dept_no,Date from_date,Date to_date){
            this.emp=emp;
            this.dept_no=dept_no;
            this.from_date=from_date;
            this.to_date=to_date;
        }
    }

    public class dept_manager{
        int emp;
        String dept_no;
        Date from_date;
        Date to_date;

        public dept_manager(int emp,String dept_no,Date from_date,Date to_date){
            this.emp=emp;
            this.dept_no=dept_no;
            this.from_date=from_date;
            this.to_date=to_date;
        }

    }
    public class salaries{
        int emp;
        int salary;
        Date from_date;
        Date to_date;

        public salaries(int emp,int salary,Date from_date,Date to_date){
            this.emp=emp;
            this.salary=salary;
            this.from_date=from_date;
            this.to_date=to_date;
        }
    }
    public class titles{
        int emp;
        String title;
        Date from_date;
        Date to_date;

        public titles(int emp, String title, Date from_date, Date to_date){
            this.emp=emp;
            this.title=title;
            this.from_date=from_date;
            this.to_date=to_date;
        }
    }
    public class department{
        String dept_no;
        String dept_name;

        public department(String dept_no,String dept_name){
            this.dept_no=dept_no;
            this.dept_name=dept_name;
        }
    }


}
