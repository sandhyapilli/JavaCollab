package programs;

public class Fibonacci {
 public static void main(String args[]) {
	 int n=8;
	 int first=0,second=1;
	 System.out.println("fibonacci series");//F(n)=F(n-1)+F(n-2)
	 
	 for(int i=2;i<n;i++) {
		 int next=first+second;
		 System.out.println(next);

		 first=second;
		 second=next;
		 	 }
 }
}