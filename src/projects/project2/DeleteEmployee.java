package projects.project2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File original = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\loginDetails.txt");
		File updated = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\modified.txt");
		int flag =0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(original));
			BufferedWriter bw = new BufferedWriter(new FileWriter(updated,false));
			String line;
			System.out.println("Enter Id for deleting the data : ");
			String id = sc.nextLine();
			while((line=br.readLine())!=null) {
				if(line.trim().equals("")) continue;
				String[] data = line.split(",");
				if(data[0].equals(id)) {
					System.out.println("data deleted successfully");
					flag= 1;
					continue;
					
				}
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
			if(flag==1) {
				original.delete();
				updated.renameTo(original);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
