import java.sql.*;
import java.util.*;

class menu {
    menu() {
        System.err.println("\t\t\t\t\t\t\t---------------------MENU---------------------");
        System.err.println("\t\t\t\t\t\t\t1.Enter 1 For Check Connection with Database.");
        System.err.println("\t\t\t\t\t\t\t2.Enter 2 For Create a Table.");
        System.err.println("\t\t\t\t\t\t\t3.Enter 3 For Insert data in the Table.");
        System.err.println("\t\t\t\t\t\t\t4.Enter 4 For Show data from the Table.");
        System.err.println("\t\t\t\t\t\t\t5.Enter 5 For Update data.");
        System.err.println("\t\t\t\t\t\t\t6.Enter 6 For Delete data.");
        System.err.println("\t\t\t\t\t\t\t7.Enter 7 For Exit.");
        System.err.println("\t\t\t\t\t\t\t-----------------------------------------------");
    }
}
class getcon {
    String path = "jdbc:mysql://localhost:3306/dhaval";
    String uname = "root";
    String password = "";
    Scanner sc = new Scanner(System.in);

    getcon() {
    }
}

class chkcon extends getcon {
    chkcon() {
        try {
            Connection con = DriverManager.getConnection(path, uname, password);
            if (con.isClosed()) {
                System.err.println("******************************************");
                System.err.println("Database Not Connected...");
                System.err.println("******************************************");
            } else {
                System.err.println("******************************************");
                System.err.println("Database Connected Successfully...");
                System.err.println("******************************************");
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Invalid Path or Database Name...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }
}

class createtable extends getcon {
    createtable() {
        try {
            Connection con = DriverManager.getConnection(path, uname, password);
            String query = "create table student(id int(3) primary key auto_increment,name varchar(255),city varchar(255))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.err.println("******************************************");
            System.err.println("Table Created Successfully...");
            System.err.println("******************************************");
            con.close();
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Table Not Created...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }
}

class insertdata extends getcon {
    insertdata() {
        try {
            Connection con = DriverManager.getConnection(path, uname, password);
            System.err.print("Enter Student Name : ");
            String name = sc.nextLine();
            System.err.print("Enter Student City : ");
            String city = sc.nextLine();

            String query = "insert into student (name,city) values ('" + name + "','" + city + "')";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            System.err.println("******************************************");
            System.err.println("Data Inserted Successfully...");
            System.err.println("******************************************");
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Data Not Inserted...");
            System.err.println("******************************************");
            e.printStackTrace();
        }

    }
}

class showdata extends getcon {
    showdata() {
        try {
            Connection con = DriverManager.getConnection(path, uname, password);
            String query = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.err.println("\tId\t\tName\t\t\t\tCity");
            System.err.println("\t-----------------------------------------------------------");
            while(rs.next()){
                System.err.println("\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t\t"+rs.getString(3));
            }
            System.err.println("\n\n");
            con.close();
        } catch (SQLException e) {
            System.err.println("******************************************");
            System.err.println("Data Not Found...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }
}
class updatedata extends getcon{
    updatedata(){
        try{
                Connection con = DriverManager.getConnection(path, uname, password);
                 String updatequery = "update student set name = 'Rahul' Where id = 1";
              Statement st = con.createStatement();
             st.executeUpdate(updatequery);
                System.err.println("******************************************");
                System.err.println("Record Updated Successfully...");
                System.err.println("******************************************");
        }
        catch(SQLException e)
        {
            System.err.println("******************************************");
            System.err.println("Record Not Updated...");
            System.err.println("******************************************");
            e.printStackTrace();
        }
    }
}
class select extends scanner {
    select() {
        System.err.print("Enter Your Choice From Above Menu :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                new chkcon();
                break;
            case 2:
                new createtable();
                break;
            case 3:
                new insertdata();
                break;
            case 4:
                new showdata();
                break;
            case 5:
                new updatedata();
                break;
            case 7:
                System.err.println("******************************************");
                System.err.println("Good Bye!...");
                System.err.println("******************************************");
                System.exit(0);
            default:
                System.err.println("******************************************");
                System.err.println("Please Enter Valid Choice...");
                System.err.println("******************************************");

        }
    }
}

class mydb {
    public static void main(String[] args) {
        while (true) {
            new menu();
            new select();
        }
    }
}