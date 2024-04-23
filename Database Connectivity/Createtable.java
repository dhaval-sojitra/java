import java.sql.*;
class Createtable{
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaval", "root", "");

            String craetequery = "create table student(id int(4) primary key auto_increment,name varchar(255),city varchar(255),phone int(10))";

            Statement st = con.createStatement();
            st.executeUpdate(craetequery);

            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
