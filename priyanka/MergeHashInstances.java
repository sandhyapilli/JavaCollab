package priyanka;

import java.util.HashMap;
import java.util.Map;

public class MergeHashInstances {
 public static void main(String[] args) {
	Map<Integer, String> merge= new HashMap<Integer, String>();
	merge.put(1, "Sandhya");
	merge.put(2, "Siri");
	merge.put(3, "aishu");
	merge.put(4, "sravs");
	Map<Integer, String> result=new HashMap<Integer, String>();
	//result.putAll(merge);
	result.put(5, "priyanka");
	result.put(6, "usha");
	result.putAll(merge);
	for(Map.Entry<Integer, String> output:result.entrySet()) {
		System.out.println(output.getKey()+":"+output.getValue());
	}
}
}
