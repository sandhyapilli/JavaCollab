package priyanka;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {
public static void main(String[] args) {
	Map<Integer, String> list= new HashMap<>();
	list.put(1, "Sandy");
	list.put(2,  "Siri");
	list.put(3, "Sravs");
	list.put(4, "priya");
	for(Map.Entry<Integer, String> result:list.entrySet()) {
		System.out.println(result.getKey()+"-name is:"+result.getValue());
	}
}
}
