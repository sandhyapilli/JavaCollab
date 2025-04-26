package priyanka;

import java.util.ArrayList;
import java.util.List;

public class Exist {
public static void main(String[] args) {
	List<String> elements=new ArrayList<String>();
	elements.add("Sandhya");
	elements.add("Siri");
	elements.add("sravs");
	elements.add("aishu");
	if(elements.contains("Siri")) {
		System.out.println("element exists in the list");
	}else {
		System.out.println("Not exists in the list");
	}
}
}
