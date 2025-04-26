package streams;

import java.util.ArrayList;
//import java.util.function.Consumer;
//import java.util.function.Function;

public class Traverse {
	public static void main(String args[]) {
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(1);
		a.add(7);
		a.add(8);
		//a.stream().forEach(System.out::println); //use this to print all the numbers.
//		Consumer<Integer> f=i->{              //we should use consumer.
//			System.out.println("Squares of "+i+" numbers"+(i*i));
//		};
		//a.stream().forEach(f);
		//instead of all the above 16th line to 19 we can do like below.
		a.stream().forEach(i->{
			System.out.println("The square of number"+(i*i));
		});
	}

}
