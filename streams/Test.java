package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
   public static void main(String args[]) {
	   ArrayList<Integer> al=new ArrayList<Integer>();
	   al.add(0);
	   al.add(5);
	   al.add(10);
	   al.add(2);
	   al.add(4);
	   al.add(7);
	   //System.out.println(al);
	   //List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	   //List<Integer> u=al.stream().map(i->i+5).collect(Collectors.toList());
	   //long noOfElements=al.stream().filter(i->i<35).count();
	   //List sort=al.stream().sorted().collect(Collectors.toList());
	  // List sort=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
	     List<Integer> sort=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	         //if we put "minus" infront of i1.compare or interchange i1&i2 places, will get opposite output.
	   System.out.println(sort);
	   
   }
}
 