package digiquad;

import java.util.HashMap;
import java.util.Map;

public class Example {
public static void main(String args[]) {
	String s="AABBC";
	
	Map<String,Integer> frequencyCount= new HashMap<String, Integer>();
	for(char result:s.toCharArray()) {
		frequencyCount.put(String.valueOf(result), frequencyCount.getOrDefault(String.valueOf(result),0) +1);
}
	for(Map.Entry<String, Integer> output: frequencyCount.entrySet()) {
		if(output.getValue()==1) {
			System.out.println(output.getKey()+":"+output.getValue());
		}
	}
}}
