package priyanka;

public class CountCharacter {
public static void main(String[] args) {
	String name="SandhyaPilli";
	
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	int count=0;
	for(int j=0;j<name.length();j++) {
	if(name.charAt(j)==ch) {
		count++;
	}}
	System.out.println(ch+":"+count);
}
}}
