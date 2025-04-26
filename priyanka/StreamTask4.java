package priyanka;

import java.util.Arrays;
import java.util.List;

public class StreamTask4 {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(0,4,7,2,6,1,9);
	Integer result=list.stream().reduce(0,(a,b)->(a>b)?a:b);
	System.out.println(result);
//	List<Integer> numbers = Arrays.asList(-5, -2, 3, 7);
//	int min = numbers.stream().reduce(0, (a, b) -> (a < b) ? a : b);
//	System.out.println(min); // Output: 1 (Incorrect!)


}
}
