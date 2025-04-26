package programs;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String args[]) {
		Integer[] arr1= {1,2,3,4};
		Integer[] arr2= {1,2,3,4};
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Two arrays are identical");
		}else {
			System.out.println("Two arrays are not identical");
		}
	}}

