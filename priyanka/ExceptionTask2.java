package priyanka;

import java.util.Scanner;

public class ExceptionTask2 {
public static void main(String[] args) {
	int[] arr= {1,2,43,5,6};
	try {
	//for(int i=0;i<arr.length;i++) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter index number:");
    	int c=sc.nextInt();
	
		System.out.println(arr[c]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Entered index number exceeds length"+e.getMessage());
	}finally {
		System.out.println("Program execution completed");
	}
}
}
