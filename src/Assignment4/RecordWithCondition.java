package Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RecordWithCondition {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","prachi");
			Statement stt = conn.createStatement();
			String query = "SELECT * FROM Students WHERE Branch='civil' AND YOP=2024";
			ResultSet resul = stt.executeQuery(query);
			while(resul.next()) {
				int id = resul.getInt("Roll_no");
				int yop = resul.getInt("YOP");
				int marks = resul.getInt("Marks");
				String name = resul.getString("Name");
				String branch = resul.getString("Branch");
				System.out.println(id + "   " + name + "   " +branch + "      " + yop + "    " + marks);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
