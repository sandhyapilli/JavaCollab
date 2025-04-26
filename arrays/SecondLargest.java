package arrays;

import java.util.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	Integer[] arr= {12, 35, 1, 10, 34, 1};
	Arrays.sort(arr);
	Integer result=arr[arr.length-2];
	System.out.println(result);
}
}
