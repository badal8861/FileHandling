package bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferwriter {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("D://pankaj//filehandling//B.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Abhi");
		bw.write("/n");
		bw.newLine();
		bw.write("100");
		char c[]={'a','b'};
		bw.write(c);
		bw.flush();
		fw.flush();
		fw.close();
		bw.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}