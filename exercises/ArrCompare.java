package exercises;

import java.util.HashSet;
import java.util.Set;

public class ArrCompare {
public static void main(String[] args) {
	Integer[] arr1= {3,2,5,7};
	Integer[] arr2= {2,3,5,7};
	boolean isEqual=compareArrays(arr1,arr2);
	if(isEqual) {
		System.out.println("Two Arrays are same.");
	}else {
		if(!isEqual) {
			System.out.println("Two arrays are not same.");
		}
	}

}
private static boolean compareArrays(Integer[] arr1, Integer[] arr2) {
	// TODO Auto-generated method stub
	Set<Integer> a=new HashSet<Integer>();
	Set<Integer> b= new HashSet<Integer>();
	for(int num:arr1) {
		a.add(num);
	}
	for(int num1:arr2) {
		b.add(num1);
	}
	return a.equals(b);
}
}
