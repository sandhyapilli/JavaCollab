package collections;

import java.util.TreeSet;

public class TreeSetEx {
   public static void main(String args[]) {
	   TreeSet<String> t= new TreeSet<>();//it is parameterless constructor so it is comparable interface-
	                                      //-to sort the elements it uses compareTo()
	   t.add("E");
	   t.add("B");
	   t.add("D");
	   t.add(new StringBuffer("C").toString());
	   t.add("A");
	   System.out.println(t);
	   System.out.println("First Element "+t.first());
	   System.out.println("Last Element "+t.last());
	   System.out.println("head set element is:"+t.headSet("B"));
	   System.out.println("tail set element is:"+t.tailSet("C"));
	   System.out.println("Sub set is:"+t.subSet("A","C"));
	   System.out.println("Descending order"+t.descendingSet());
	   
	   
   }
}
