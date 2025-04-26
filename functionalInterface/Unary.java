package functionalInterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //UnaryOperator<Integer> u=i->i*i;
		IntUnaryOperator u=i->i*i;
          System.out.println(u.applyAsInt(6));
	}

}
