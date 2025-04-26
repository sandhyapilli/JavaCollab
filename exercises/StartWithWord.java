package exercises;

import java.util.Arrays;
import java.util.List;

//Implement a program to filter strings from a list that start with a specific letter 
//and convert them to uppercase.
public class StartWithWord {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Sandhya","Siri","Sravs","Aishu");
	list.stream().filter(i->i.startsWith("S")).map(i->i.toUpperCase()).forEach(System.out::println);
	
}
}
