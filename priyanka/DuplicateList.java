package priyanka;

import java.util.ArrayList;
import java.util.List;

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
}}
