import java.io.File;

public class CreatingFileusingMethod {

	public static void main(String[] args) {
		
		try {
		File f=new File("D://pankaj//filehandling//A.txt");
		System.out.println(f);
		boolean newfile=f.createNewFile();
		System.out.println(newfile);
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
