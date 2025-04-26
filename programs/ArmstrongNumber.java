package programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int OriginalNumber=number;
		double result=0;
		int noOfDigits=String.valueOf(number).length();
		while(number!=0) {
			int digit=number%10;
			 result=result+Math.pow(digit, noOfDigits);
			 number=number/10;
		}System.out.println(result);
		if(result==OriginalNumber) {
			System.out.println("Given number is Armstrong number:"+result);
		}
		else
				System.out.println("Not a armstrong number");
			}
		
	}


