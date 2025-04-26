package collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class SetEx {
	public static void main(String args[]) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(2);
		//stem.out.println(s);
		//s.remove(3);
		 //System.out.println(s);
		
		HashSet<Integer> hs=new HashSet<Integer>(s);
		hs.add(7);
		hs.add(9);
		hs.add(11);
		//s.addAll(hs);
		//System.out.println(s);  //or we can use addAll() method instead of using
		                            //17th line bracket of s.
		//hs.removeAll(s);

		//System.out.println(s);
		Iterator<Integer> i= s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
