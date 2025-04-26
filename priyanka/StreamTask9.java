package priyanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTask9 {
public static void main(String[] args) {
	List<String> list= Arrays.asList("Usha", "priyanka", "sandhya");
	//String result=list.stream().reduce((a,b)->a+b).orElse("nothing to print");
	String result=list.stream().reduce((a,b)->a+","+b).orElse("No data");
	System.out.println(result);
}
}
