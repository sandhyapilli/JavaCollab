package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
 public static void main(String args[]) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the string:");
	 String input=sc.nextLine();
	 String pattern="^\\+91\\s\\d{10}";
	 Pattern compiled=Pattern.compile(pattern);
	 Matcher match=compiled.matcher(input);
	 
	 if(match.matches()) {
		 System.out.println("You have entered the string in correct format");
	 }else {
		 System.out.println("String format is incorrect");
	 }
 }
}
