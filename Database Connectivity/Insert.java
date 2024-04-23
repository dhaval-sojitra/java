import java.sql.*;

class Insert{
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhaval","root","");
            String query = "Insert into student (name,city,phone) values ('Dhaval Sojitra','Surat',635139)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.executeUpdate();
            System.err.println("Record inserted successfully");
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}