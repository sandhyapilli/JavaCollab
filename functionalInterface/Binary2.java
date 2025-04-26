package functionalInterface;

import java.util.function.IntBinaryOperator;

public class Binary2 {
	public static void main(String args[]) {
		IntBinaryOperator abc=(i,j)->i*j;
		System.out.println(abc.applyAsInt(2, 6));
	}

}
