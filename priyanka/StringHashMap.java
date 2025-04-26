package priyanka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringHashMap {
public static void main(String[] args) {
	Map<String, List<String>> list= new HashMap<>();
	list.put("Fruits", Arrays.asList("Banana", "Orange", "watermelon"));
	list.put("trees",Arrays.asList("Coco","rose", "neem"));
	List<String> fruits = list.get("Fruits");
    System.out.println("Fruits: " + fruits);

    // Iterating over the map
    for (Map.Entry<String, List<String>> entry : list.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
	
}

