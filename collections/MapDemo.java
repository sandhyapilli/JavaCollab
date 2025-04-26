package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String args[]) {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(4,"Sandhya");
		hm.put(2, "Siri");
		hm.put(7, "Sravs");
		hm.put(8, "Aishu");
		hm.put(1, "Priyanka");
		System.out.println(hm);
		System.out.println("Value of key 3:"+hm.get(2));
		System.out.println("Deleted element:"+hm.remove(1));
		System.out.println(hm);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry etr=(Map.Entry)itr.next();  //Entry is inner interface
			System.out.println("Key="+etr.getKey()+","+"Value="+etr.getValue());
		System.out.println(etr);
		}
	}

}
