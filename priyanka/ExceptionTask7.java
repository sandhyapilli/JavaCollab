package priyanka;

import java.util.Scanner;

public class ExceptionTask7 {
	public static void main(String[] args) throws InvalidMarksException {
		
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks");
int marks=sc.nextInt();
try {
	if(marks<0 || marks>100) {
		throw new InvalidMarksException("marks you entered are less than 0 or greater than 100. Please enter valid marks");
		
	}
	else{
		System.out.println("valid");
		}}catch(InvalidMarksException e) {
	
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Completed");
	}
}
}
	

