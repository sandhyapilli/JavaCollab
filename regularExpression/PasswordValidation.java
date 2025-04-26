package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
public static void main(String[] args) {
	String input="Jesus14-";
	String pattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[._%+-])[A-Za-z0-9._%+-]{8}$";
	Pattern compiled=Pattern.compile(pattern);
	Matcher match=compiled.matcher(input);
	if(match.find()) {
		System.out.println("valid");
	}else {
		System.out.println("invalid");
	}
}
}
