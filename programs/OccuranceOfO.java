package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class OccuranceOfO {
   public static void main(String[] args) {
	   
	String str="welcome to the monocept";
	//String[] s=str.split("");
	//List<String> elements=new ArrayList<String>();
//	for(String newElements:s) {
//		elements.add(newElements);
//	}
////	for(String result:elements) {
////		System.out.println(result);
////	}
//	Iterator<String> iterate=elements.listIterator();
//	if(iterate.hasNext()) {
//		if(elements.equals('o')) {
//			iterate.next();
//		count++;
//	}System.out.println(count);
	Long count=str.chars().filter(i->i=='o').count();
	System.out.println(count);
	
}}
