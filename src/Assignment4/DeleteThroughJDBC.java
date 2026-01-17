package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteThroughJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root",									"@aP3ch41#");
			Statement stt = conn.createStatement();
			ResultSet res = stt.executeQuery("SELECT * FROM Students");
			System.out.println("Before removing: ");
			while(res.next()) {
				int id = res.getInt("Roll_no");
				int yop = res.getInt("YOP");
				int Marks = res.getInt("Marks");
				String name = res.getString("Name");
				String Branch = res.getString("Branch");
				System.out.println(id+"     "+name+"     "+Branch+"     "+Marks+"     "+yop);
			}
			res.close();
			String sql = "DELETE FROM Students WHERE Branch='civil' AND YOP=2024";
			stt.executeUpdate(sql);
			ResultSet res1 = stt.executeQuery("SELECT * FROM Students");
			
			System.out.println("After removing: ");
			while(res1.next()) {
				int id = res1.getInt("Roll_no");
				int yop = res1.getInt("YOP");
				int Marks = res1.getInt("Marks");
				String name = res1.getString("Name");
				String Branch = res1.getString("Branch");
				System.out.println(id+"     "+name+"     "+Branch+"     "+Marks+"     "+yop);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
