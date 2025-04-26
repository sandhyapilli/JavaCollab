package exercises;

public class Occurence {
public static void main(String[] args) {
	String str="Hello World";
	char input='l';
	String result=removeCharacter(str,input);
	System.out.println(result);
}

private static String removeCharacter(String str, char input) {
	
	return str.replace(Character.toString(input)," ");
}
}
