package priyanka;

public class PalindromeCheck {
	public static void main(String[] args) {
		
     String name="amma";
     int l=name.length();
     String result="";
     for(int i=l-1;i>=0;i--) {
    	 result=result+name.charAt(i);
     }
   // System.out.println(result);
    if(result.equals(name)) {
    	System.out.println("string is palindrome");
    }else {
    	System.out.println("Not a plaindrome");
    }
}

}