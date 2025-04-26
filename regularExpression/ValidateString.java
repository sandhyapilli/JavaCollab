package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateString {
public static void main(String[] args) {
	String s="hello";
	String pattern="^[A-za-z]+$";
	Pattern compiled=Pattern.compile(pattern);
	Matcher match=compiled.matcher(s);
	
	if(match.matches()) {
		System.out.println("valid");
	}else {
		System.out.println("invalid");
	}
}
}
