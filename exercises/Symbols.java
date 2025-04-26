package exercises;

import java.util.Arrays;
import java.util.List;


public class Symbols {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,4,6,3,5,7,8,10,9);
	int sumEven=list.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
	int sumOdd=list.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
	System.out.println(sumEven+" "+sumOdd);
}
}