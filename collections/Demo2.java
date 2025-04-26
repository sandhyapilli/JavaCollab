package collections;

import java.util.ArrayList;

public class Demo2 {
  public static void main(String args[]) {
	  ArrayList<Integer> al = new ArrayList<>();  //if we remove generics here we can store any type of data.
	 // al.add("sandy");
	 // al.add("siri");
	  al.add(23);
	  //al.add('a');
	 // al.add("siri");
	  //al.remove("siri");
	  System.out.println(al);   //only one siri has been removed from here.
//	  ArrayList a= new ArrayList();
//	  a.addAll(al);
//	  //a.addAll(0, a);
//	 a.set(2,"Sandhya");
//	  a.removeAll(a);
//	  System.out.println(a);
//	   System.out.println(al.get(0));
//	  
  }
}
