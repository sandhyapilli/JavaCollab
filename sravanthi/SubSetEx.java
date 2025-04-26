package sravanthi;

import java.util.HashSet;
import java.util.Set;

public class SubSetEx {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]= {1,2,3};
		
	Set<Integer> list= new HashSet<>();
	for(int set:arr) {
		list.add(set);
	}
    boolean isSubset=true;
    for(int set1:arr1) {
    	if(!list.contains(set1)) {
    	isSubset=false;
    	break;
    }
  
}  System.out.println(isSubset?"arr is subset of arr1":"arr is not subset of arr1");
	}
    }