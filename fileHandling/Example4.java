package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
	public static void main(String args[]) {
		File f= new File("C:\\Users\\Other user\\Documents\\Example2.txt");
		String content="Yes! I got it..";
	
    try {
    	FileWriter d=new FileWriter("C:\\Users\\Other user\\Documents\\Example2.txt");
    	d.write(content);
    	System.out.println("Content Placed Successfully!!");
    	d.close();
    }catch(IOException di){
    	System.out.println("File not found");
    }
}}
