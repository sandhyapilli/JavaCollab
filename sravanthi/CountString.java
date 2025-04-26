package sravanthi;

import java.util.HashMap;
import java.util.Map;

public class CountString {
public static void main(String[] args) {
	String str="programming";
	Map<Character, Integer> counting= new HashMap<>();
	for(Character ch:str.toCharArray()) {
        counting.put(ch, counting.getOrDefault(ch, 0)+1);
		}
	for(Map.Entry<Character, Integer> result:counting.entrySet()) {
		System.out.println(result.getKey()+":"+result.getValue());
	}
}
}
