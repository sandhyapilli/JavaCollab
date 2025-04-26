package priyanka;

import java.util.HashMap;
import java.util.Map;

public class ChatGpt {
public static void main(String[] args) {
	String s="Sandhya";
	
	Map<String, Integer> list=new HashMap<>();
	for(char result:s.toCharArray()) {
		list.put(String.valueOf(result),list.getOrDefault(String.valueOf(result), 0)+1);
	}for(Map.Entry<String, Integer> count:list.entrySet()) {
		if(count.getValue()<=1) {
			System.out.println(count.getKey().toString());
	}
}

}}