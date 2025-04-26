package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayEx {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(6);
		a.add(4);
         Integer[] i=a.stream().toArray(Integer[]::new);
//         for(Integer c:i) {
//        	 System.out.println(c);
//        	 
//         } //converting stream objects into array
         Stream.of(i).forEach(System.out::println); //Again converting array into stream objects.
	}

}
