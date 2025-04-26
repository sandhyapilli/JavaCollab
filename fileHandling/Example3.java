package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Example3 {
	public static void main(String args[]) {
		File f= new File("C:\\Users\\Other user\\Documents\\filehandling.txt ");
		String content="What's special for today!!";
		
	
	try {
		FileWriter fw= new FileWriter("C:\\Users\\Other user\\Documents\\filehandling.txt");
		fw.write(content);
		System.out.println("Its successfully added to your file");
		fw.close();
	}catch(IOException e) {
		System.out.println("File not found");
	}

}
}