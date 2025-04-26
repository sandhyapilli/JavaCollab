package priyanka;

import java.util.TreeSet;

public class SubSetElements {
public static void main(String[] args) {
	TreeSet<String> ele= new TreeSet<String>();
	
	ele.add("B");
	ele.add("D");
	ele.add("I");
	ele.add("Y");
	ele.add("A");
	ele.add("S");
	TreeSet<String> subset=new TreeSet<String>(ele.subSet("D", "Y"));
	for(String result:subset) {
		System.out.println(result);
	}
}
}
