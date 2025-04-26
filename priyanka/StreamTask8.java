package priyanka;

import java.util.Arrays;
import java.util.List;

public class StreamTask8 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	Integer result=numbers.stream().reduce(0,(a,b)->a+b);
	System.out.println(result);
}
}
