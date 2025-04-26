package fileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
     public static void main(String args[]) {
    	 String fileName="binaryFile.dat";
    	 try{
    		 FileOutputStream fos= new FileOutputStream(fileName);
    	 
    			 DataOutputStream dos= new DataOutputStream(fos);
    		 dos.writeInt(123);
    		 dos.writeDouble(3.14);
    		 dos.writeUTF("Hello, Binary File!");
    		 		
    		System.out.println("Data Written into file:"+fileName); 
    	 }catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
}
