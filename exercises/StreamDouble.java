package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDouble {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,34,24,67,23);
	List<Integer> numbers=list.stream().map(i->i*2).collect(Collectors.toList());
	for(Integer newList:numbers) {
		System.out.println(newList);
	}
}
}
