package priyanka;

import java.util.Arrays;
import java.util.List;

public class StreamTask5 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10, 60, 45, 80, 30, 90);
	long list=numbers.stream().filter(i->i>50).count();
	System.out.println(list);
}
}
