package priyanka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	list.add(1);
	list.add(5);
	list.add(8);
	list.add(2);
//	for(Integer elements:list) {
//		System.out.println(elements);
//	}
	Collections.sort(list);
	System.out.println("ascending order:"+list);
	Collections.sort(list,Collections.reverseOrder());
	System.out.println("Descending order:"+list);
}
}
