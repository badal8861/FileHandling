import java.io.File;

public class AFile {

	public static void main(String[] args) {

		File f = new File("D://Pankaj//Filehandling//A.txt");
		boolean f1 = f.exists();
 
		System.out.println(f1);

	}
}
