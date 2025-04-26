package priyanka;

import java.util.Arrays;
import java.util.List;

public class StreamParellel {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,3,6,2,5,3,7,4,8,9,2,4,65,7);
	//list.parallelStream().map(i->i*2).forEach(System.out::println);
	list.parallelStream().filter(i->i%2==0).forEach(System.out::println);
}
}
