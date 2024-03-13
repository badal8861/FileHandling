import java.io.File;

public class MakeDirectory {

	public static void main(String[] args) {

		File f = new File("D://pankaj/test");
		boolean res = f.mkdir();
		boolean delete=f.delete();
		System.out.println(delete);
	}
}
