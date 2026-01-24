package projects.project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter Id to be get the employee details: ");
		String id = sc.next();
		int flag =0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\loginDetails.txt"));
			String line ;
			
			while((line=br.readLine())!=null) {
				if(line.trim().equals("")) break;
				String data[] = line.split(",");
				if(data[0].equals(id)) {
					flag = 1;
					System.out.println("Employee Details are : ");
					System.out.println("Id : "+id+"     name : "+data[1]+"    salary: "+data[3]+"     dept : "+data[4]);
					break;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		if(flag==0) {
			System.out.println("Employee Doesn't Existed");
			System.out.println("Do you want to register  (Y/N)  : ");
			String inp = sc.next();
			if(inp.equals("Y")) AddEmployee.main(args);
			else System.out.println("Thankyou!");
		}
	}
}
