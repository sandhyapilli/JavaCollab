package exercises;

import java.util.Arrays;

public class LargestNumber {
public static void main(String[] args) {
	
	    
	        int[] arr = {8, 6, 0, 4, 6, 4, 2, 7};

	        Arrays.sort(arr); // Sort the array in ascending order

	        // To form the largest number, we need to arrange the digits in descending order
	        // So, we print the sorted array in reverse order
	        System.out.print("Largest number possible: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i]);
	        }
	    }
	

}

