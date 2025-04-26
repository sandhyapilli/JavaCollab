package priyanka;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomCompare {
public static void main(String[] args) {
	TreeSet<Integer> list= new TreeSet<>(new Comparator<Integer>() {
		@Override
		public int compare(Integer num1, Integer num2) {
			return num2-num1;
		}});
	 
	
	list.add(5);
	list.add(4);
	list.add(1);
	list.add(8);
	list.add(2);
	list.add(7);
	list.add(9);
	list.add(15);
System.out.println(list);

	    
//	        // Create a list of integers
//	        List<Integer> numbers = new ArrayList<>();
//	        numbers.add(5);
//	        numbers.add(1);
//	        numbers.add(8);
//	        numbers.add(3);
//	        numbers.add(10);
//
//	        System.out.println("Original List: " + numbers);
//
//	        // Sort the list in descending order using a custom comparator
//	        Collections.sort(numbers, new Comparator<Integer>() {
//	            @Override
//	            public int compare(Integer num1, Integer num2) {
//	                return num2 - num1; // Descending order
//	            }
//	        });
//
//	        System.out.println("Sorted List (Descending Order): " + numbers);
//	    }
//	}

}
}
