package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example {
    public static void main(String args[]) {
    	File e= new File("C:\\Users\\Other user\\Documents\\filehandling.txt");
    	Example l = new Example();
    	l.writeToFile(e);
    }
    public void writeToFile(File fileTOWrite) {
    PrintWriter e=null;
    try {
    	e=new PrintWriter(fileTOWrite);
    	e.println("sandhya");
    	e.println("100");
    }catch(FileNotFoundException f){
    	System.out.println("file not found"+fileTOWrite.getName());
    	throw new RuntimeException(f);
    	
    }finally {
    	e.close();
    }
    }
}
