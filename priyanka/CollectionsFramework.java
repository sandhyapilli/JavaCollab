package priyanka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFramework {
	public static void main(String[] args) {
        // Creating a List using ArrayList
        List<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java"); // Duplicate allowed

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Iterating through the List
        System.out.println("Iterating through the List:");
        
      for (String language : list) {
            System.out.println(language);
        }

        // Removing an element
        list.remove("C++");
        System.out.println("After removal: " + list);

        // Sorting the List
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
