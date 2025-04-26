package priyanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(1);
	list.add(3);
	list.add(3);
	list.add(5);
	list.add(7);
	ArrayList<Integer> unique= new ArrayList<Integer>();
	for(Integer item:list) {
	if(!unique.contains(item)) {
		unique.add(item);
	}
}System.out.println(unique);
//	List<Integer> list= Arrays.asList(1,2,1,2,3);
//	Set<Integer> result=new HashSet<>(list);
//	Integer[] afterRemove=result.toArray(new Integer[0]);
//	for(Integer unique:afterRemove) {
//		System.out.println(unique);
//	}
}}
	
