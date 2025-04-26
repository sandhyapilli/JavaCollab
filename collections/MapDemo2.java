package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String args[]) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(10, "Sandy");
		m.put(1, "usha");
		m.put(5, "Sravs");
		m.put(2, "Siri");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.remove(5));
		Set s=m.entrySet(); //set is iterable,it allows easy iteration over the keys of the map.
		                    //Set to store keys a map ensures that the uniqueness constraint is enforced consistently 
		                    //across all operations,such as put&get&remove. 
		Iterator i= s.iterator();
		while(i.hasNext()) {
			Map.Entry k= (Map.Entry)i.next();
			System.out.println(k);
		}
		
	}

}
