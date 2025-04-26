package priyanka;

public class StringBufferReplace {
public static void main(String[] args) {
//	StringBuffer result= new StringBuffer("Sandhya");
//	result.reverse();
//	System.out.println(result);
	
	        // Create a StringBuffer object with initial capacity
	        StringBuffer buffer = new StringBuffer();

	        // Print initial capacity of StringBuffer
	        System.out.println("Initial capacity: " + buffer.capacity());

	        // Append a large amount of text to the StringBuffer
	        String largeText = "A".repeat(1000); // String with 1000 'A's
	        buffer.append(largeText);

	        // Print capacity after appending the large text
	        System.out.println("Capacity after appending large text: " + buffer.capacity()+"largeText"+buffer);
	    
	}

}

