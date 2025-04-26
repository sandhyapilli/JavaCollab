package collections;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String args[]) {
		LinkedList l= new LinkedList();
		l.add("sandy");
		l.add(20);
		l.add(null);
		l.add("Siri");
		System.out.println(l);
		l.set(2, "Harsha");
		System.out.println(l);
		l.add(0,"Amma");  //This is used to add at required place based on index.
		System.out.println(l);
		l.removeLast();
		l.addFirst("Daddy");
		l.set(3, "Siri");
		System.out.println(l);
		
	}

}
