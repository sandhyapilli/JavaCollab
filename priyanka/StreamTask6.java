package priyanka;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTask6 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
	//names.stream().sorted().forEach(System.out::println);
	//names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	Collections.sort(names, Collections.reverseOrder());
	System.out.println(names);
}
}
