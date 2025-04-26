package collections;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String args[]) {
		ArrayList a= new ArrayList();
		a.add("sandhya");
		a.add("siri");
		a.add(10);
		a.add(null);
	    a.remove(2);
		//for(int i=0;i<a.size();i++) {
		//	System.out.println(a.get(i) );
			
			
		//}
		ArrayList al= new ArrayList(a);
	    al.add("Aishu");
	    al.add("sandy");
		//System.out.println(al);
		//al.retainAll(a);
		//System.out.println(al);
		al.size();
		//al.clear();
		System.out.println(al);
	}

}
