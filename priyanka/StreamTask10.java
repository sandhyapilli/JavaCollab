package priyanka;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask10 {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Sandy", "Sravs","aishu");
	String result=list.stream().filter(i->i.startsWith("S")).findFirst().orElse("");
	System.out.println(result);
}
}
