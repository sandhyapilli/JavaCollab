package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String args[]) {
		TreeMap tm=new TreeMap();
		tm.put("Sandy",1000);
		tm.put("Usha",5000);
		tm.put("Siri", 4000);
		tm.put("Aishu", 500);
		tm.put("Priyanka", 9000);
		System.out.println(tm);
		Set s=tm.entrySet();
	    Iterator i=s.iterator();
	    while(i.hasNext()) {
	    	Map.Entry l=(Map.Entry)i.next();
	    	System.out.println(l.getKey()+" : "+l.getValue());
	    	
	    }
	   Integer val=((Integer)tm.get("Siri")).intValue(); //Here we can change it double based on the value u have given
	                                                     //using put method.
	   val=val+1000; //here we can insert required number.
	   tm.put("Siri", val);
	   System.out.println("Siri new balance after updation:"+tm.get("Siri"));
	}

}
