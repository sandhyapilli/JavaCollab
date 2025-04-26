package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorEx {
	public static void main(String...args) {
	List<String> a= new ArrayList<String>();
	a.add("Sandhya");
	a.add("Sravs");
	a.add("Siri");
	a.add("Aishu");
	a.add("Harsha");
	   ListIterator<String> l=a.listIterator();
	   System.out.println("Traversing the list from forward direction");
	   while(l.hasNext()) {
		   System.out.println(l.next());
	   }
	   System.out.println("Traversing the list from backward direction");
	   while(l.hasPrevious()) {
		   System.out.println(l.previous());
	   }
	   System.out.println("Searched name");
	   while(l.hasNext()) {
		   String s=(String)l.next();
		   if(s.equals("Siri")) 
			   l.set("Sandy");
			  
		   
	   } System.out.println(a);
	   ;
	}

	

}
