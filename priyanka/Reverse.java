package priyanka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse {
public static void main(String[] args) {
	LinkedList<String> list= new LinkedList<String>();
	list.add("Sandhya");
	list.add("Siri");
	list.add("Sravs");
	list.add("Aishu");
	list.add("Jyothi");
	list.add("Rishika");
	ListIterator<String> ele=list.listIterator(list.size());
	while(ele.hasPrevious()) {
		System.out.println(ele.previous());
		
	}
}
}
