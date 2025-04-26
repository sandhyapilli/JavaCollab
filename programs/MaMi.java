package programs;
import java.util.ArrayList;
import java.util.Comparator;
public class MaMi {
 public static void main(String args[]) {
	
	         ArrayList<Integer> numbers = new ArrayList<>();
	         numbers.add(10);
	         numbers.add(34);
	         numbers.add(2);
	         numbers.add(45);
	         numbers.add(6);

	         // Find maximum number
	         Integer max = numbers.stream()
	                             .max(Comparator.naturalOrder())
	                             .orElseThrow(() -> new RuntimeException("Empty list"));

	         // Find minimum number
	         Integer min = numbers.stream()
	                             .min(Comparator.naturalOrder())
	                             .orElseThrow(() -> new RuntimeException("Empty list"));

	         System.out.println("Maximum number: " + max);
	         System.out.println("Minimum number: " + min);
	     }
	 

 }

