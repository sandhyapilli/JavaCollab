package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apexon {
public static void main(String[] args) {
	List<String> list= Arrays.asList("Sandy:elder", "Siri:younger", "Sravs:middle");
	Map<String, String> result= new HashMap<>();
	for(String adds:list) {
		String[] words=adds.split(":");
		if(words.length==2) {
			result.put(words[0], words[1]);
		}
	}
	for(Map.Entry<String, String> output: result.entrySet()) {
		System.out.println(output);
	}
}
}
