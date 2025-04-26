package collections;

import java.util.Vector;

public class VEx {
  public static void main(String args[]) {
	  Vector v = new Vector();
	  //System.out.println(v.capacity());
	  //it will 10 as output because the initial capacity of vector and arrayList is 10.
	  //System.out.println(v.size());
	  //it will give 0 because its base on the no of elements.
	  for(int i=0;i<=10;i++) {
		  v.addElement(i);
		  
		 
	  } System.out.println(v.capacity());
	  System.out.println(v);
  }
}
