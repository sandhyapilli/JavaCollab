package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	 public static void main(String args[]) {
		 ArrayList al = new ArrayList();
	     al.add("Sandhya");
	     al.add("Siri");
	     al.add("Aishu");
	     al.add("Sravs");
	     al.add("Harsha");
	     al.add("usha");
	    Iterator it= al.iterator(); 
	    while(it.hasNext()) {
	    	//System.out.println(it.next());
	    	String s= (String)it.next();
	    	if(s.equals("Sravs")){
	    		it.remove();
	    		
	    	}
	    }
	    Iterator i= al.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	    
	   
	     
	 }

}
