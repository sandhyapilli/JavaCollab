package functionalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		int[] x= {1,4,2,5,7,8,9};
		//Predicate<Integer> p=i->i%2==0;
		IntPredicate p=i->i%2==0;
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
				//it only prints even numbers only.
			}
		}

	}

}
