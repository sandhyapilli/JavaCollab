package collections;

import java.util.Vector;
import java.util.Enumeration;
public class VEx2 {
   public static void main(String args[]) {
	   Vector v= new Vector();
	   v.add('A');
	   v.add('B');
	   v.add('c');
	   v.add('D');
	   v.add('E');
	   Enumeration e=v.elements();
	   while(e.hasMoreElements()) { 
		   //it checks is there is more elements if yes it returns true and go to nextElement.
		   //it is used to print objects element by element.
		   System.out.println(e.nextElement());
		   
	   }
	   
   }
}
