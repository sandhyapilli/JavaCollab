package collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
  public static void main(String args[]) {
	  List<String> names= new ArrayList<>();
	  names.add("Sandy");
	  names.add("siri");
	  names.add("sravs");
	  names.add("aishu");
	  names.add("priyanka");
	  
	  //System.out.println("The names are:"+names);
	  
//	  for(String name:names) {
//		  System.out.println(name);
	  
	 // }
	  
//	  for(int i=0;i<names.size();i++) {
//		  System.out.println("The names are:"+names.get(i));
//		  
	 // }
     names.remove(3);
     System.out.println(names);
     
     
     
  
  }
}
