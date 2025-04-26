package priyanka;

import java.util.SortedMap;
import java.util.TreeMap;

public class RetriveSubMap {
public static void main(String[] args) {
	TreeMap<Integer, String> list= new TreeMap<Integer, String>();
	list.put(1, "Sandhya");
	list.put(3, "Siri");
	list.put(5,  "priya");
	list.put(2, "aishu");
   SortedMap<Integer, String> result= list.subMap(1, 3);
	System.out.println(result);
}
}
//// ✅ Storing in SortedMap (Valid)
//SortedMap<Integer, String> subMap = map.subMap(2, 4);
//System.out.println("SubMap (2 to 4): " + subMap);
//
//// ✅ Storing in NavigableMap (Valid for the overloaded version)
//NavigableMap<Integer, String> subMapInclusive = map.subMap(2, true, 4, true);
//System.out.println("SubMap (2 to 4, inclusive): " + subMapInclusive);