package projects.project2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowSortedOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//file copy - collection;
		ArrayList<String[]> list = new ArrayList<>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\Web_Dev\\placement_resources\\HCL\\Selenium_codes\\loginDetails.txt"));
			String line ;
			while((line=br.readLine())!=null) {
				if(line.trim().equals(""))continue;
				String data[] = line.split(",");
				list.add(data);
			}
			list.sort((a,b)->a[0].compareToIgnoreCase(b[0]));
		}catch(IOException e) {
			e.printStackTrace();
		}
		for(String ar[]:list) {
			for(int i=0;i<ar.length;i++) {
				
			}
		}
	}
}
