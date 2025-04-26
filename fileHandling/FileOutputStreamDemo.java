package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String args[]) throws IOException{
		FileOutputStreamDemo file= new FileOutputStreamDemo();
		file.writeToFile(new File("C:\\Users\\Other user\\Documents\\OutputStream.txt"));
	}

          private void writeToFile(File file) throws IOException {
	      FileOutputStream f=new FileOutputStream(file);
	      f.write("Hello!! Hope you guys are enjoying the session".getBytes());
	      f.close();

}}