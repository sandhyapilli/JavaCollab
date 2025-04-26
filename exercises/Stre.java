package exercises;


import java.util.Arrays;
import java.util.List;

public class Stre {
public static void main(String[] args) {
	List<String> list= Arrays.asList("11","18","20","24","85","66","13");
	list.stream().filter( i ->i.startsWith("1")).forEach(System.out::println);
	
}
}