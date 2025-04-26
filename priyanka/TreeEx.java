package priyanka;

import java.util.Set;
import java.util.TreeSet;

public class TreeEx {
public static void main(String[] args) {
	Set<Integer> elements= new TreeSet<>();
	elements.add(2);
	elements.add(6);
	elements.add(8);
	elements.add(1);
	for(Integer result:elements) {
		System.out.println(result);
	}
	//System.out.println(elements);
}
}
