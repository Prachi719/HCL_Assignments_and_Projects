package projects.project2;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.util.UUID;

public class AddEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = UUID.randomUUID().toString();
		File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\loginDetails.txt");
		try {
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("New File Created");
				} else {
					System.out.println("File Already Present");
				}
				
		}catch(IOException e) {
				e.printStackTrace();
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
			System.out.println("                        --------Register Yourself -------");
			System.out.println();
			System.out.println("Enter Your Name:  ");
			String name = sc.next();
			System.out.println("Enter Your Password:  ");
			String pass = sc.next();
			System.out.println("Enter Your Salary :  ");
			String salary = sc.next();
			System.out.println("Enter Your Department :  ");
			String dept = sc.next();
//			id+","
			bw.write(id+","+name+","+pass+","+salary+","+dept);
			System.out.println("Registered Successfully! Your ID is : "+id);
			System.out.println("Thankyou");
			bw.newLine();
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
