package string;

public class ReverseString {
public static void main(String[] args) {
	String s="Sandhya";
	int l=s.length();
	String result="";
	for(int i=l-1;i>=0l;i--) {
		result=result+s.charAt(i);
		
	}System.out.println(result);
}
}
