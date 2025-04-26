package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,3,2,1,5,4);
		List<Integer> duplicates=list.stream().filter(i->list.indexOf(i) != list.lastIndexOf(i))
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("The duplicate elements are"+duplicates);
	}

}
