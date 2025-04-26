package string;

public class CountVC {
public static void main(String[] args) {
	String s="I am 98 learning Java and springboot";
	int count=0;
	int counting=0;
	for(int i=0;i<s.length();i++) {
		s=s.toLowerCase();
		char ch=s.charAt(i);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		
		count++;
			
}
}
	System.out.println("vowels count"+count);
	
for(int i=0;i<s.length();i++) {
	s=s.toLowerCase();
	char ch=s.charAt(i);
	if(Character.isLetter(ch) && ch!='a' && ch!='e' && ch!='o' && ch!='i' && ch!='u') {
		counting++;
	}
}System.out.println("Consonants count:"+counting);
}
}