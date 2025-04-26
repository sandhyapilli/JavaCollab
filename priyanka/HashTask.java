package priyanka;

import java.util.HashSet;
import java.util.Set;

public class HashTask {
public static void main(String[] args) {
	Set<Integer> elements= new HashSet<Integer>();
	elements.add(11);
	elements.add(11);
	elements.add(11);
	elements.add(11);
	elements.add(12);
	elements.add(11);
	elements.add(11);
	elements.add(11);
	elements.add(31);
	elements.add(11);
	elements.add(11);
	for(Integer result:elements) {
		System.out.println(result);
	}
}
}
