package priyanka;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	    public static void main(String[] args) {
	        // Create a HashMap
	        Map<Integer, String> map = new HashMap<>();

	        // Adding key-value pairs
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");

	        // Accessing elements
	        System.out.println("Value for key 2: " + map.get(2)); // Banana

	        // Check for keys and values
	        System.out.println("Contains key 3: " + map.containsKey(3)); // true
	        System.out.println("Contains value 'Grapes': " + map.containsValue("Grapes")); // false

	        // Iterating over the map
	        System.out.println("Iterating through entries:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Removing a key
	        map.remove(2);
	        System.out.println("After removal: " + map);
	    }
	}


