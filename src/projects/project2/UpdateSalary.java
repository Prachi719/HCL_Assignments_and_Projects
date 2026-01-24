package projects.project2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpdateSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			File f = new File("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\Web_Dev\\\\placement_resources\\\\HCL\\\\Selenium_codes\\\\loginDetails.txt");
			File modify = new File("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\Web_Dev\\\\placement_resources\\\\HCL\\\\Selenium_codes\\\\modified.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter bw = new BufferedWriter(new FileWriter(modify,false));
			System.out.println("Enter id to update Salary: ");
			String id = sc.nextLine();
			String line;
			int flag=0;
			while((line=br.readLine())!=null) {
				if(line.trim().equals(""))continue;
				
				String data[] = line.split(",");
				if(id.equals(data[0])) {
					flag = 1;
					System.out.println("Id matched ");
					System.out.println("Enter updated Salary");
					String salary = sc.nextLine();
					System.out.println("Previous salary: "+data[3]+"  Updated Salary: "+salary);
					bw.write(id+","+data[1]+","+data[2]+","+salary+","+data[4]);
					System.out.println("Salary updated Successfully");
				}else {
					bw.write(line);
					
				}
				bw.newLine();
			}
			bw.close();
			br.close();
			f.delete();
			modify.renameTo(f);
			if(flag==0) System.out.println("Id not Matched");
			bw.close();
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
