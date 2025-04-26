package programs;
	import java.util.Arrays;

	public class Largest{
	    public static void main(String[] args) {
	        Integer[] numbers = {10, 34, 2, 45, 6};

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Second largest number will be at index length - 2
	        int secondLargest = numbers[numbers.length - 2];

	        System.out.println("Second largest number: " + secondLargest);
	    }
	}


