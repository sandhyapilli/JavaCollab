package collections;

import java.util.Vector;
import java.util.Enumeration;
public class Cursors {
	public static void main(String args[]) {
		Vector v = new Vector();
		v.add("sandhya pilli");
		v.add("siri");
		v.add("sravs");
		v.add("usha pilli");
		v.add("aishu");
		Enumeration e= v.elements();
		
		while(e.hasMoreElements()) {
			String s= (String)e.nextElement();
			if(s.endsWith("pilli")) {
				System.out.println(s);
			}
			
		}
		
	}

}
