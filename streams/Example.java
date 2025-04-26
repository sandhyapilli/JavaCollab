package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String args[]) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Sandhya");
		a.add("Siri");
		a.add("Aishu");
		a.add("Jyothi");
		a.add("Sravs");
		//List<String> name=a.stream().filter(s1->s1.contains("Sandhya")).collect(Collectors.toList());
		
		//System.out.println(name);
		List<String> names=a.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(names);
	}

}
