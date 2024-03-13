import java.io.File;

public class CountNoOfCharsInFile {

	public static void main(String[] args) {
	
		File f=new File("D://pankaj//filehandling//A.txt");
		long l=f.length();
		System.out.println(l);
	}
}
