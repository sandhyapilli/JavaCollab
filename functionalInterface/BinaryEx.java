package functionalInterface;

import java.util.function.IntUnaryOperator;

public class BinaryEx {
	public static void main(String args[]) {
		IntUnaryOperator i=j->j+1;
		//System.out.println(i.applyAsInt(2));
		IntUnaryOperator a=j->j*j;
		//System.out.println(a.applyAsInt(2));
		System.out.println(i.andThen(a).applyAsInt(4));
	}

}
