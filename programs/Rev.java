package programs;

public class Rev {
public static void main(String[] args) {
	String name="hello world";
	//To covert string into character
//     char[] ch=name.toCharArray();
//     for(int i=0;i<ch.length/2;i++) {
//    	 ch[i]^=ch[ch.length-1-i];
//    	 ch[ch.length-1-i]^=ch[i];
//    	 ch[i]^=ch[ch.length-1-i];
//    	 
//     }
//     //To convert character back to string
//     String reverse=new String(ch);
//     System.out.println(reverse);
	
	String s="Sandy";
	int length=s.length();
	String reversed="";
	for(int i=length-1;i>=0;i--) {
	reversed=reversed+s.charAt(i);
	}
	System.out.println(reversed);
		
	}

}