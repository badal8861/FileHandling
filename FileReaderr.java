package fileReader;

import java.io.File;
import java.io.FileReader;

public class FileReaderr {

 public static void main(String[] args) {
	
	 try {
		 File f=new File("D://pankaj//filehandling//A.txt");
		 FileReader fr=new FileReader(f);
		 for(int i=0;i<f.length();i++) {
			 System.out.print((char)fr.read());
		 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
}
}