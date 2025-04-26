package priyanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTask1 {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(1,3,8,4,9,5);
	list.stream().filter(i->i%2==0).forEach(System.out::println);
	
}
}
