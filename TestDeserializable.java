package deserializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserializable  {

	 public static void main(String[] args) {
		try {
		 FileInputStream fi=new FileInputStream("D://pankaj//filehandling//Badal.ser");
		 ObjectInputStream oi=new ObjectInputStream(fi);
		 Deserializablee d=(Deserializablee)oi.readObject();
		 System.out.println(d.name);
		 System.out.println(d.password);
		 
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}