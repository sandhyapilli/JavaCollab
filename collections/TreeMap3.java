package collections;

import java.util.TreeMap;

public class TreeMap3 {
     public static void main(String args[]) {
    	 TreeMap<Integer,String> map= new TreeMap<Integer,String>();
    	 map.put(1, "Siri");
    	 map.put(2, "Sandy");
    	 map.put(3, "Sravs");
    	 map.put(4, "Aishu");
    	 System.out.println("descending Map"+map.descendingMap());
    	 System.out.println("Head elements:"+map.headMap(3));
    	 System.out.println("tail elements:"+map.tailMap(2));
    	 System.out.println("Sub set elements:"+map.subMap(1, 4));
     }
}
