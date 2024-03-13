package fileReader;

import java.io.File;
import java.io.FileReader;

public class ReadingWithDiff {

	public static void main(String[] args) {

		try {

			File f = new File("D://pankaj//filehandling//A.txt");
			FileReader fr = new FileReader(f);

			char c[] = new char[(int) f.length()];

			fr.read(c);

			for (char ch : c) {
				System.out.print(ch);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}