package programs;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Multi {
	
	    public static void main(String[] args) {
//	        // Implementing the functional interface using a lambda expression
//	        Multiplier multiplier = (a, b) -> a * b;
//
//	        // Using the implemented functional interface to multiply two numbers
//	        int result = multiplier.multiply(5, 10);
//	        System.out.println("Result: " + result);  // Output: Result: 50
	    	BiFunction<Integer, Integer,Integer> result=(Integer a, Integer b) -> (a*b);
	    	System.out.println(result.apply(10, 20));
	    }
	}
