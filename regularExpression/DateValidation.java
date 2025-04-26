package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidation {
    public static void main(String[] args) {
		String input="23/01/2001";
		String pattern="[0-9]{2}/[0-9]{2}/[0-9]{4}";
		Pattern compiled=Pattern.compile(pattern);
		Matcher match=compiled.matcher(input);
		
		if(match.matches()) {
			System.out.println("valid");
			
		}else {
			System.out.println("invalid");
		}
	}
}
