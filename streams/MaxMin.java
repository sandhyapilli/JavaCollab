package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
	public static void main(String args[]) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(9);
		System.out.println(l);
		//List<Integer> sort=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		//Integer sort=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer sort=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	    System.out.println(sort);
	}

}
