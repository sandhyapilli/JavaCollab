package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
public static void main(String[] args) {
	Integer[] arr= {1,34,56,2,1,2};
	Set<Integer> eliminate=new HashSet<>(Arrays.asList(arr));
	Integer[] afterE=eliminate.toArray(new Integer[0]); //it provides an empty array of integer.
	for(Integer elements:afterE) {
		System.out.println(elements);
	}
	
}
//	List<Integer> list= Arrays.asList(1,3,2,1,2);
//	Set<Integer> duplicate=new HashSet<>(list);
//	for(Integer result:duplicate) {
//		System.out.println(result);
//	}
	

	}
