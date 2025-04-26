package priyanka;

public class Counter {
	private static int count=0;
	public Counter() {
		count++;
	}
	public static void getCount() {
		System.out.println(count);
}public static void main(String[] args) {
	Counter c1=new Counter();
	Counter c2= new Counter();
	Counter c3= new Counter();
	Counter.getCount();
}
}
