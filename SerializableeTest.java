package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializableeTest {

	public static void main(String[] args) {
		
			try {
				 FileInputStream fi=new FileInputStream("D://pankaj//filehandling//Badal.ser");
				 ObjectInputStream oi=new ObjectInputStream(fi);
				 Serializablee s=(Serializablee)oi.readObject();
				 System.out.println(s.name);
				 System.out.println(s.password);
				 
			}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
		
}