package programs;

public class Reverse {
 public static void main(String args[]) {
	 String str="Sandy";
	 String rever=" ";
	 for(int i =str.length()-1;i>=0;i--) {
		 rever=rever+str.charAt(i);
		 
	 }
	 System.out.println(rever);
 }
}
