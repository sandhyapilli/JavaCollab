package practiceCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Order {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(12,34,56,23,1);
//	List<Integer> numbers=list.stream().sorted().collect(Collectors.toList());
//	System.out.println(numbers);
	Set<Integer> sort=new TreeSet<>(list);
	System.out.println(sort);
}
}
