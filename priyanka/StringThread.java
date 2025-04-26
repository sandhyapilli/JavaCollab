package priyanka;

public class StringThread {

	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");
	        
	        // Append text
	        sb.append(" World");
	        System.out.println(sb); // Output: Hello World

	        // Insert text
	        sb.insert(5, ",");
	        System.out.println(sb); // Output: Hello, World

	        // Replace text
	        sb.replace(6, 7, "Java");
	        System.out.println(sb); // Output: Hello Java World
           // System.out.println(sb.charAt(8));
	        // Reverse string
	        sb.reverse();
	        System.out.println(sb); // Output: dlroW avaJ olleH
	    }
	}


