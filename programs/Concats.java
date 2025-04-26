package programs;

import java.util.ArrayList;
import java.util.List;

public class Concats {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("sandy");
	names.add("Aishu");
	names.add("siri");
	names.add("sravs");
	names.add("harsha");
	StringBuilder s=new StringBuilder();
	for(String s1:names) {
		s.append(s1);
	}
	String result=s.toString();
	System.out.println(result);
}
}
