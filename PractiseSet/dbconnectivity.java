import java.sql.*;
import java.util.*;

class vars {
    String path;
    String user;
    String password;
    Connection con;
    Scanner sc = new Scanner(System.in);
    vars() {
        path = "jdbc:mysql://localhost:3306/dhaval";
        user = "root";
        password = "";
        try{
            con = DriverManager.getConnection(path, user, password);
        }
        catch (SQLException e) {
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
        
    }
}

class menu {
    menu() {
        System.err.println("-------------------------MENU-------------------------");
        System.err.println("\t\t1.For check connection");
        System.err.println("\t\t2.For create table");
        System.err.println("\t\t3.For insert data");
        System.err.println("\t\t4.For update data");
        System.err.println("\t\t5.For delete data");
        System.err.println("\t\t6.For show data");
        System.err.println("\t\t7.Exit");
        System.err.println("---------------------------------------------------------");
    }
}

class chekccon extends vars {
    chekccon() {
        try {
            Connection con = DriverManager.getConnection(path, user, password);
            if (con.isClosed()) {
                System.err.println("**********************************************");
                System.err.println("Database is not Connected...");
                System.err.println("**********************************************");
            } else {
                System.err.println("**********************************************");
                System.err.println("Database is Connected Successfully...");
                System.err.println("**********************************************");
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}

class createtable extends vars {
    createtable() {
        try {
            String createquery = "create table student(id int(3) primary key auto_increment,name varchar(255),city varchar(50),phone int(12))";
            Statement st = con.createStatement();
            st.executeUpdate(createquery);
            System.err.println("**********************************************");
            System.err.println("Table Created Succesfully...");
            System.err.println("**********************************************");
            con.close();
        } catch (SQLException e) {
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}
class insertdata extends vars{
    insertdata()
    {
        try{
            System.err.print("Enter Name :");
            String name = sc.nextLine();
            System.err.print("Enter City :");
            String city = sc.nextLine();
            System.err.print("Enter Phone :");
            int phone = sc.nextInt();
            String insertquery = "insert into student (name,city,phone) values ('"+ name +"', '"+ city +"',"+ phone +")";
            PreparedStatement pst = con.prepareStatement(insertquery);
            pst.executeUpdate();
            System.err.println("**********************************************");
            System.err.println("Data Inserted Succesfully...");
            System.err.println("**********************************************");
            con.close();
        }
        catch(SQLException e)
        {
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}
class updatedata extends vars{
    updatedata()
    {
        try{
            String updatequery = "update student set city='rajkot' where name = 'dhaval'";
            Statement st = con.createStatement();
            st.executeUpdate(updatequery);
            System.err.println("**********************************************");
            System.err.println("Data Updated Succesfully...");
            System.err.println("**********************************************");
            con.close();
        }
        catch(SQLException e){
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}
class deletedata extends vars{
    deletedata()
    {
        try{
            System.err.print("Which record you want to delete enter it's id :");
            int id = sc.nextInt();
            String  deletequery = "delete from student where id = "+ id +"";
            Statement st = con.createStatement();
            st.executeUpdate(deletequery);
            System.err.println("**********************************************");
            System.err.println("Data Deleted Successfully...");
            System.err.println("**********************************************");
            con.close();
        }
        catch(SQLException e)
        {
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}
class showdata extends vars{
    showdata()
    {
        try{
            String  selectquery = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectquery);
            System.err.println("\tID\t\tNAME\t\tCITY\t\tPHONE");
            while(rs.next())
            {
                System.err.println("\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4));
            }
            con.close();
        }
        catch(SQLException e){
            System.err.println("**********************************************");
            System.err.println("Error in connecting to the database.");
            System.err.println("**********************************************");
            e.printStackTrace();
        }
    }
}
class select extends vars {
    select() {
        System.err.print("Enter Your Choice : ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                new chekccon();
                break;
            case 2:
                new createtable();
                break;
            case 3:
                new insertdata();
                break;
            case 4:
                new updatedata();
                break;
            case 5:
                new deletedata();
                break;
            case 6:
                new showdata();
                break;
            case 7:
                System.err.println("Good Bye!");
                System.exit(0);
            default:
                System.err.println("Please Enter Valid Choice...");
                break;
        }
    }
}

public class dbconnectivity {
    public static void main(String[] args) {
        while (true) {
            new menu();
            new select();
        }
    }
}
