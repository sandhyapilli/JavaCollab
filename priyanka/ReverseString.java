package priyanka;

public class ReverseString {
public static void main(String[] args) {
	String s="sandhya";
	String result="";
	int l=s.length();
	for(int i=l-1;i>=0;i--) {
		result=result+s.charAt(i);
	}
	System.out.println(result);
}
}
