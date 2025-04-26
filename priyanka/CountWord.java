package priyanka;

public class CountWord {
public static void main(String[] args) {
//	String str="I am learning java";
//	int count=0;
//	
//	for(int i=0;i<str.length();i++) {
//		if(str.charAt(i)!=' ' && (i==0 || str.charAt(i-1)==' ')) {
//			count++;
//		}
//	}//i == 0:
//
////This ensures that the very first character of the string is checked. If it is not a space, it marks the start of the first word.
////sentence.charAt(i - 1) == ' ':
//
////This checks if the character before the current one is a space. If the previous character is a space, and the current character is not a space, it indicates the start of a new word.
//	System.out.println(count);
	
	String str="Java Programming Language";
	String[] result=str.split(" ");
	int count=0;
	for(String words:result) {
		//System.out.println(words);
		count++;
		
	}System.out.println(count);
	
}}

