package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Iter {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(7);
	list.add(10);
	list.add(23);
//	for(Integer result:list) {
//		if(result%2==0){
//			list.remove(result);
//		}
//	}//it will throw concurrentmodificationException
	list.remove(0);
	System.out.println(list);
	Iterator<Integer> itr=list.iterator();
	while (itr.hasNext()) {
		int num = itr.next();
		if (num % 2 == 0) {
			itr.remove();
		}
	}
	System.out.println(list);
//	List<Integer> result=list.stream().filter(i->i%2==0).collect(Collectors.toList());
//	System.out.println(result);
}}