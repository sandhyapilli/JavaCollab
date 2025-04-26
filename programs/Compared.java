package programs;

public class Compared {
public static void main(String[] args) {
	String s="Sandy";
	String s1="Sandy";
	if(s.length()!=s1.length()) {
		System.out.println("Two strings are different");
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=s1.charAt(i)) {
			System.out.println("Two Strings are different");
		}
	}System.out.println("Two strings are identical");
}
}