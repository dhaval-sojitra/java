import java.sql.*;
class Con{
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dhaval";
			String uname = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url,uname,password);

			if(con.isClosed())
			{
				System.out.println("Connection Closed..");
			}
			else{
				System.out.println("Connection Success..");

			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}