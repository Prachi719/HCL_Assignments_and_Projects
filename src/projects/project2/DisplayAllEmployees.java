package projects.project2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DisplayAllEmployees {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\loginDetails.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("File created Successfully");
			} else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line ;
			System.out.println("Employees are : ");
			System.out.println("        Id                                         UserName			Salary			Department");
			while((line=br.readLine())!=null) {
				String data[] = line.split(",");
				if(line.trim().equals("")) break;
				String id = data[0];
				String name = data[1];
				System.out.println(id+"      "+name+"                 	"+data[3]+"      	 	"+data[4]);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
