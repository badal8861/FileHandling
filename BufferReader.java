package bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
 
	public static void main(String[] args) {
		try {
		FileReader fr=new FileReader("D://pankaj//filehandling//A.txt");
		BufferedReader br=new BufferedReader(fr);
		//single character it will read System.out.println((char)br.read());
		//whole line use readLine()
		System.out.println(br.readLine());
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}