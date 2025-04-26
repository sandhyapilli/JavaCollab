package priyanka;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreammTask10 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Charlie", "Annie","sandhya","sandy");
	Map<Character,List<String>>  list=names.stream().collect(Collectors.groupingBy(name -> name.charAt(1)));
	System.out.println(list);
}
}
