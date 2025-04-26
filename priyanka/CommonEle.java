package priyanka;

import java.util.HashSet;
import java.util.Set;

public class CommonEle {
public static void main(String[] args) {
	Set<String> list= new HashSet<String>();
	list.add("Sandhya");
	list.add("Siri");
	list.add("sravs");
	list.add("jyothi");
	list.add("priyanka");
	Set<String> ele= new HashSet<String>();
	ele.add("Sandhya");
	ele.add("Siri");
	list.retainAll(ele);
	System.out.println(list);
}
}
