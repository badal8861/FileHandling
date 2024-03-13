import java.io.File;

public class CheckDocuments {

	public static void main(String[] args) {
		try {
		File f=new File("D://pankaj//filehandling");
		String [] names=f.list();
		
		for(String s:names) {
			
			System.out.println(s);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
