package priyanka;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask3 {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Sandy", "Sravs", "Siri", "Aishu","Priyanka");
	List<String> result=list.stream().filter(i->i.startsWith("S")).collect(Collectors.toList());
	System.out.println(result);
}
}
