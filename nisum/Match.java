package nisum;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Match {
public static void main(String args[]) {
	int number=153;
	int OriginalNumber=number;
     double result=0;
	int ArmstorngNumber=String.valueOf(number).length();
	while(number!=0) {
		int digit=number%10;
		result=result+Math.pow(digit,ArmstorngNumber);
		number=number/10;
	}
		System.out.println(result);
		if(OriginalNumber==result) {
			System.out.println("Given number is armstorng number");
		}
	}
}