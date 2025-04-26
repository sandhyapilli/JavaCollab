package programs;

import java.util.Scanner;

public class PalindroS {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a String:");
	String name=sc.next();
	int l=name.length();
	String reverse="";
	
	for(int i=l-1;i>=0;i--) {
		reverse=reverse+name.charAt(i);
	}
	System.out.println("Reverse String is "+reverse);
	if(name.toLowerCase().equals(reverse.toLowerCase())) {
		
		System.out.println("Palindrome!!");
	}
		else 
			System.out.println("Not a Palindrome!!");
		
	}
	
}

