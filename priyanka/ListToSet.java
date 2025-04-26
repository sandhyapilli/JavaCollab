package priyanka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
public static void main(String[] args) {
//	List<Integer> list= new ArrayList<>();
//	list.add(1);
//	list.add(2);
//	list.add(3);
//	list.add(4);
//	list.add(3);
//	list.add(1);
//	Set<Integer> set= new HashSet<>(list);
//	System.out.println(set);
	Set<Integer> list= new HashSet<Integer>();
	list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(3);
     list.add(1);
     List<Integer> list2= new ArrayList<>(list);
     System.out.println(list2);
}
}
