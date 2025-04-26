package programs;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
public static void main(String args[]) {
	String[] str= {"ab", "abc", "ab", "acd", "abc", "sdfsdf"};
	HashMap<String, Integer> result=new HashMap<String, Integer>();
	for(String occurs:str) {
		result.put(occurs,result.getOrDefault(occurs, 0)+1);
	}for(Map.Entry<String, Integer> finalResult:result.entrySet()) {
		if(finalResult.getValue()>1) {
			System.out.println(finalResult.getKey()+" occurs "+finalResult.getValue()+" times");
		}
	}
}
}
