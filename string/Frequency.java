package string;

public class Frequency {
public static void main(String[] args) {
	String s="Sandhya Sirisha Sravanthi Aishu";

	int count=0;

	//char ch=s.charAt(i);
	String result="";
	//char ch=result.charAt(i);
	for(int i=0;i<s.length();i++) {

		if(s.charAt(i)==s.charAt(i)) {
			result=result+s.charAt(i);
			count++;
		}
	}System.out.println("The count "+count);
}
}//not completed yet and doubt
