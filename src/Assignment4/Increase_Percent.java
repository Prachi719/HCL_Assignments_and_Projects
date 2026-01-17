package Assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Increase_Percent {

	public static void main(String[] args) {
		try{
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","prachi");
					Statement stt = conn.createStatement();
//					String sql = "ALTER TABLE Students"+" ADD Branch Varchar(20), "+"ADD Marks INTEGER";
//					String sql = "INSERT INTO Students (Roll_no, Name, Marks, Branch) VALUES " +
//				             "(2, 'Pratik', 80, 'AIML'), " +
//				             "(4, 'Samiksha', 77, 'CSE'), " +
//				             "(5, 'mini', 67, 'CSE'), " +
//				             "(6, 'deepu', 85, 'AIML')";
//					stt.executeUpdate(sql);
					
					String sql = "UPDATE Students SET Marks = IFNULL(Marks,0)+5 WHERE Branch='CSE' ";
					stt.executeUpdate(sql);
					System.out.println("columns added");
		}catch(Exception e) {
			System.out.println("Not Connected");
			e.printStackTrace();
		}
	}

}
