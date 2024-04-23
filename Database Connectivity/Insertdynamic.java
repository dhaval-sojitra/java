import java.sql.*;
import java.util.*;
public class Insertdynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaval","root","");
            System.err.print("Enter Your Name :");
            String name = sc.nextLine();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
