package priyanka;

import java.util.Arrays;
import java.util.List;

public class StreamTask7 {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 6, 6, 7);
    numbers.stream().distinct().forEach(System.out::println);
}
}
