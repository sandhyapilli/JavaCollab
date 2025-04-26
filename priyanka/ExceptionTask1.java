package priyanka;

import java.util.Scanner;

public class ExceptionTask1 {
public static void main(String[] args) {
	try {
	int a=10;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number for b:");
	int b=sc.nextInt();
	int c=a/b;
	System.out.println(c);
}catch(ArithmeticException e){
	System.out.println(e.getMessage()+"exception occurs:");
}finally {
	System.out.println("calculation completed");
}
}}
