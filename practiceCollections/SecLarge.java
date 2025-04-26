package practiceCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecLarge {
public static void main(String[] args) {
	List<Integer> numbers= new ArrayList<>();
	numbers.add(12);
	numbers.add(24);
	numbers.add(15);
	numbers.add(10);
  // Set<Integer> sort= new TreeSet<Integer>(numbers);
   Integer sort=numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
  if(sort!=null) {
	  System.out.println("Second largest number is:"+sort);
  }else
  System.out.println("The second largest number is null");
}
}
