package variables;

public class Counter {
	
	    // Static variable to count the number of instances created
//	    public static int instanceCount = 0;
//	    
//	    // Constructor
//	    public Counter() {
//	        instanceCount++; // Increment the static variable each time a new instance is created
//	    }
//	    
//	    // Method to get the current count of instances
//	    public static int getInstanceCount() {
//	        return instanceCount;
//	    }
//	    
//	    public static void main(String[] args) {
//	        // Creating instances of Count
//	    	Counter counter1 = new Counter();
//	        Counter counter2 = new Counter();
//	        Counter counter3 = new Counter();
//	        
//	        // Printing the count of instances
//	        System.out.println("Number of instances created: " + Counter.getInstanceCount()); // Output: 3
//	    }
	
	    // Static variable
	    int staticVariable = 10;

	    public static void main(String[] args) {
	        // Creating two objects of Example class
	        Counter obj1 = new Counter();
	        Counter obj2 = new Counter();

	        // Accessing and modifying static variable using object reference
	        System.out.println("obj1.staticVariable before modification: " + obj1.staticVariable); // Output: 10
	        obj1.staticVariable = 20; // Modifying static variable
	        System.out.println("obj2.staticVariable after modification using obj1: " + obj2.staticVariable); // Output: 20

	        // Accessing static variable using class name
	       // System.out.println("Static variable using class name: " + Counter.staticVariable); // Output: 20
	    }
	
	}

