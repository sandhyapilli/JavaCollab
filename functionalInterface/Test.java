package functionalInterface;

import java.util.function.Function;

public class Test {
	public static void main(String args[]) {
//		Function<Integer,Integer> f=i->i*i;
//		System.out.println(f.apply(8));
		Function<String,Integer> f=s->s.length(); //here integer refers to the output should come in integer type
		                                          //and String refers to input.                    
		System.out.println(f.apply("kajdfhksjgh"));
	}

}
