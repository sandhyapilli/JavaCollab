package programs;

import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverseNumber=0,temp=number;
        
        while(temp>0) {
        	int remainder=temp%10;
        	reverseNumber=reverseNumber*10+remainder;
        	temp=temp/10;
        }
        System.out.println("Reverse number:"+reverseNumber);
        if(number==reverseNumber) {
        	System.out.println("Number is palindrome");
        }else {
        	System.out.println("Not a Palindrome");
        }
    }}