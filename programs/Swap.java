package programs;

public class Swap {
public static void main(String[] args) {
	int temp;
	int a=10;
	int b=20;
	System.out.println("before swapping"+a+""+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After swapping"+a+""+b);
}
}
