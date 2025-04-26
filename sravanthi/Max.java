package sravanthi;

import java.util.HashMap;
import java.util.Map;

public class Max {
public static void main(String[] args) {
	Integer maxValue=Integer.MIN_VALUE;
	String maxKey=null;
	Map<String, Integer> list= new HashMap<>();
	list.put("Bob", 28);
	list.put("krish", 20);
	list.put("Raj", 19);
	
	for(Map.Entry<String, Integer> result:list.entrySet()) {
		if(result.getValue()>maxValue) {
			maxKey=result.getKey();
			maxValue=result.getValue();
		}
	}System.out.println(maxKey+":"+maxValue);
}
}
