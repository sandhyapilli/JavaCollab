package programs;

import java.util.Arrays;
import java.util.List;

public class Example {
	

	
	public static void main(String[] args) {
//		List<String> list= Arrays.asList("11","18","20","24","85","66","13");
//		list.stream().filter( i ->i.startsWith("1")).forEach(System.out::println);
		List<Integer> numbers=Arrays.asList(12,23,45,23,15,18);
		numbers.stream().map(Object::toString).filter(i->i.startsWith("1")).forEach(System.out::println);
		
	}
	}

