package exercises;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flattern{
	
	
	    public static void main(String[] args) {
	        List<List<Integer>> nestedList = Arrays.asList(
	                Arrays.asList(1, 2, 3),
	                Arrays.asList(4, 5),
	                Arrays.asList(6, 7, 8, 9)
	        );

	        // Using flatMap to flatten the nestedList into a single stream of integers
	        List<Integer> flattenedList = nestedList.stream()
	                .flatMap(List::stream)
	                .collect(Collectors.toList());

	        System.out.println("Nested List: " + nestedList);
	        System.out.println("Flattened List: " + flattenedList);
	    }
	}


