package sravanthi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicaate {
public static void main(String[] args) {
	Integer arr[]= {1,3,2,3,2,5};
	Set<Integer> elements= new HashSet<>(Arrays.asList(arr));
	Integer afterEliminate[]=elements.toArray(new Integer[0]);
	for(Integer result:afterEliminate) {
		System.out.println(result);
	}
}
}
