package Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;

//concerts

public class JDBCConnection {
	public static void main(String[] args) {
		try {
			//Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con = DriverManager.getConnection(
				    "jdbc:mysql://localhost:3306/college",
				    "root",
				    "prachi"
				);
			System.out.println("Database connected successfully");
			con.close();
		}catch(Exception e) {
			System.out.println("Unable to connect");
			e.printStackTrace();
		}
	}
}