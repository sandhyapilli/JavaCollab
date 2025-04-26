package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String args[]) {
		String filePath="C:\\Users\\Other user\\Documents\\Example2.txt";
		try(FileReader f= new FileReader(filePath);
				BufferedReader bf= new BufferedReader(f)) {
					String line;
					while((line = bf.readLine())!=null) {
						System.out.println(line);
					}
				}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
