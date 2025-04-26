package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
	public static void main(String args[]) {
		File f = new File("C:\\Users\\Other user\\Documents\\filehandling.txt");
		String content="yes i am sandhya";
		try {
			FileWriter writer=new FileWriter("C:\\Users\\Other user\\Documents\\filehandling.txt");
					writer.write(content);
			writer.close();
			System.out.println("Successfully wrote to the file");
		}catch(IOException e) {
			System.out.println("An error occured while writing to the file");
			e.printStackTrace();
		}
		
	}

}
