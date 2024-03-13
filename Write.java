package fileReader;

import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("D://pankaj//filehandling//A.txt",true);
		fw.write("king");
		fw.write("007");
		
		fw.write(100);
		
		char c[]= {'b','c'};
		fw.write(c);
		
		fw.close();
		
	}
		catch(Exception e) {
			
			e.printStackTrace();
		} 
}
}