package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Parellel {
	public static void main(String args[]) {
//		int[] a= {1,4,3,6,9,2,7};
//		Arrays.stream(a).parallel().map(i->i*2).forEach(System.out::println);
//		
		IntStream.range(1, 10).parallel().forEach(System.out::println);			
		}
	}



