package priyanka;

import java.util.ArrayList;
import java.util.List;

public class StreamTask2 {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("sandy");
	list.add("siri");
	list.add("sravs");
	list.stream().map(i->i.toUpperCase()).forEach(System.out::println);
}
}
