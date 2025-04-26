package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEx {
	public static void main(String args[]) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Sandhya");
		a.add("Siri");
		a.add("Aishu");
		a.add("Jyothi");
		a.add("Sravs");
		Comparator<String> c=(s1,s2)->{
			                          int l1=s1.length();
			                          int l2=s2.length();
			                          if(l1<l2) return +1;
			                          else if(l1>l2) return -1;
			                          else return s1.compareTo(s2);
		                              };
		List<String> sorted=a.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sorted);
	}//it prints elements in the order based on length of the elements.

}
