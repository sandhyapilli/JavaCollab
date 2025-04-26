package collections;

import java.util.Stack;

public class StackEx {
	public static void main(String args[]) {
		Stack s= new Stack();
		s.push(1);
		s.push("sandy");
		s.push("Siri");
		s.push("Aishu");
		s.push("Sravs");
		s.push(7);
		//System.out.println(s);
		s.peek();
		System.out.println("Top most element"+s.peek()); //it will return siri because it follows LIFO or FILO 
		
		System.out.println(s);
		System.out.println(s.search("sandy")); // it returns the no of that particular element.
        s.pop();
        System.out.println(s);
		
	}

}
