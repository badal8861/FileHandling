import java.io.File;

public class UsingDelete {

	public static void main(String[] args) {
		
		File f=new File("D://pankaj//filehandling/sparkQA.pdf");
		boolean v=f.delete();
		System.out.println(v);
	}
}
