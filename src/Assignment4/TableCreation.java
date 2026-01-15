package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","@aP3ch41#");
			Statement stt = null;
//			String sql = "CREATE TABLE Students "+" (Name VARCHAR(30), " + " Roll_no INTEGER NOT NULL," + " PRIMARY KEY (Roll_no))";
			
			String sql = "INSERT INTO Students values('prachi baraskar',10)";
			stt = conn.prepareStatement(sql);
			stt.execute(sql);
//			System.out.println("created table student.");
			System.out.println("data inserted");
		}catch(Exception e) {
			System.out.println("not connected");
			e.printStackTrace();
		}
	}
}
