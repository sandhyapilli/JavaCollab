package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
public static void main(String[] args) {
	String sentence="jesus143@gmail.com";
	String pattern="^[A-Za-z0-9]+@[a-z]+\\.[A-Za-z]{2,}$";
	Pattern compiled=Pattern.compile(pattern);
	Matcher match=compiled.matcher(sentence);
	
	if(match.find()) {
		System.out.println("valid");
	}else {
		System.out.println("invalid");
	}
}
}
