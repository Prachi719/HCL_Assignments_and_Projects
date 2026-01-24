package Assignment4;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Helping_class {
	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("not connected to the jdbc");
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root",                            "prachi");
			Statement stt = conn.createStatement();
			//civil and 2024
			String sql = "InSERT INTO Students(Roll_no,Name,Branch,Marks,YOP) "+" Values(11,'vishal','civil',78,2024), "+" (12,'ravi','civil',90,2024)";
			stt.executeUpdate(sql);
			String que = "SELECT * FROM Students";
			ResultSet resul = stt.executeQuery(que);

			System.out.println("id      name           branch           yop           marks");

			System.out.println("Updated");
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
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","@aP3ch41#");
//			String q = "Insert into Students(name,Roll_no,Marks,Branch,YOP) Values(?,?,?,?,?)";
//			PreparedStatement pstt = conn.prepareStatement(q);
//			Scanner sc = new Scanner(System.in);
//			while(true) {
//				System.out.println("enter name: ");
//				String name = sc.next();
//				System.out.println("enter branch: ");
//				String branch = sc.next();
//				System.out.println("enter roll no: ");
//				int roll = sc.nextInt();
//				System.out.println("enter marks: ");
//				int marks = sc.nextInt();
//				System.out.println("enter yop: ");
//				int yop = sc.nextInt();
//				
//				pstt.setString(1,name);
//				pstt.setInt(2,roll);
//				pstt.setString(3,branch);
//				pstt.setInt(4,marks);
//				pstt.setInt(5,yop);
//				pstt.addBatch();
//				
//				System.out.println("wish to enter more data : Y/N");
//				String choice = sc.next();
//				if(choice.equals("N")) break;
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
	
//try {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//}catch(ClassNotFoundException e) {
//	System.out.println(e.getMessage());
//}

//try {
//	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","@aP3ch41#");
//	Statement stt = conn.createStatement();
//	String sql = "select * from Students";
//	ResultSet resul = stt.executeQuery(sql);
//	while(resul.next()) {
//		int id = resul.getInt("Roll_no");
//		int yop = resul.getInt("YOP");
//		int marks = resul.getInt("Marks");
//		String name = resul.getString("Name");
//		String branch = resul.getString("Branch");
//		System.out.println(id + " " + name + " " +branch + " " + yop + " " + marks);
//	}
//}catch(SQLException e) {
//	System.out.println("Not executed");
//	System.out.println(e.getMessage());
//	
//}
}
}