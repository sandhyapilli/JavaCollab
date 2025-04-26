package fileHandling;

import java.io.File;
import java.io.IOException;

public class Create {
public static void main(String args[]) throws IOException {
	File f = new File("C:\\Users\\Other user\\Documents\\Example2.txt");
	if(f.createNewFile()) {
		System.out.println("File has been created");
		
	}else {
		System.out.println("File already exists");
	}
}
}
