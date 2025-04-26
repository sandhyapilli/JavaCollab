package priyanka;

import java.util.HashSet;

public class Difference {
	
	    public static void main(String[] args) {
	        // Create two HashSet instances
	        HashSet<String> set1 = new HashSet<>();
	        set1.add("Apple");
	        set1.add("Banana");
	        set1.add("Cherry");
	        set1.add("Date");

	        HashSet<String> set2 = new HashSet<>();
	        set2.add("Banana");
	        set2.add("Date");
	        set2.add("Fig");
	        set2.add("Grape");

	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        set1.removeAll(set2);

//	        // Find the difference (set1 - set2)
//	        HashSet<String> difference = new HashSet<>(set1);
//	        difference.removeAll(set2);

	        System.out.println("Difference (Set 1 - Set 2): " + set1);
	    }
	}


