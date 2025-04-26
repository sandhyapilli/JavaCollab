package priyanka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveGreater {
public static void main(String[] args) {
	List<Integer> list= new LinkedList<>();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(7);
	list.add(2);
	list.add(4);
	list.add(8);
	list.add(9);
	list.add(11);
	list.add(12);
	Iterator<Integer> result=list.iterator();
	while(result.hasNext()) {
		int num=result.next();
		if(num > 3) {
			result.remove();
		}
	}System.out.println(list);
}
}
