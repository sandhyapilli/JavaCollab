package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String args[]) throws IOException {
		FileInputStreamDemo fl= new FileInputStreamDemo();
		fl.readFromFile("C:\\Users\\Other user\\Documents\\Sandhya.txt");
		
	}
   private void readFromFile(String fileToRead) throws IOException {
	   FileInputStream input=new FileInputStream(fileToRead);
	   int integerReadFromFile;
	   while((integerReadFromFile=input.read())!=-1) {
		   System.out.println("Character read from file is"+(char)integerReadFromFile);
	   }
	   input.close();
   }
}
