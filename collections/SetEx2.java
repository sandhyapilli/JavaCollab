package collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx2 {
	public static void main(String args[]) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("Sandy");
		hs.add("Siri");
		hs.add("Aishu");
		hs.add("Sravs");
		//System.out.println(hs);
		
		Iterator<String> i= hs.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		while(i.hasNext()) {
			String s=(String)i.next();
			if(s.equalsIgnoreCase("siri")) {
				i.remove();
				
			}
		}
		Iterator<String> il=hs.iterator();
		while(il.hasNext()) {
			System.out.println(il.next());
		}
		hs.clear();
		System.out.println(hs);
	}

}
