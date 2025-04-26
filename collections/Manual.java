package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Manual {
	public static void main(String args[]) {
		TreeSet<String> t= new TreeSet<>(new MyComparator());
		   t.add("E");
		   t.add("B");
		   t.add("D");
		   t.add("C");
		   t.add("A");
		   System.out.println(t);
		   
	}
	static class MyComparator implements Comparator<String>{

	
		public int compare(String o1, String o2) {
//			String s1=o1.toString();
//			String s2=o2.toString();
//			if(s1.compareTo(s2)<0) {
//				return 1;
//			}else if(s1.compareTo(s1)>0) {
//				return -1;
//				
//			}else
//				return 0;
			return o2.compareTo(o1);
		}
		
	}
	

}
