package priyanka;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		String words="I am learning java java is hard for learning";
		String[] word=words.split(" ");
	
	Map<String, Integer> counting= new HashMap<>();
	for(String result:word) {
		counting.put(result, counting.getOrDefault(result, 0)+1);
	}
	 for(Map.Entry<String, Integer> frequency:counting.entrySet()) {
		 System.out.println(frequency.getKey()+": "+frequency.getValue());
	 }

     
}}
