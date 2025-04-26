package functionalInterface;

import java.util.function.Predicate;

public class Example {
	public static void main(String args[]) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(10));
	}

}
