package practiceCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TopStudent {
	public static void main(String args[]) {
		Map<String, Integer> score= new HashMap<String, Integer>();
		score.put("Sandy",100);
		score.put("Siri", 98);
		score.put("Sravs", 99);
		score.put("Aishu", 85);
		
		String topStudentName= TopScore(score);
		System.out.println(topStudentName);
	}
	public static String TopScore(Map<String, Integer> score) {
		String topStudentName=null;
		int highScore=Integer.MIN_VALUE;
		for(Map.Entry<String,Integer> entry: score.entrySet()) {
		if(entry.getValue()>highScore) {
			highScore=entry.getValue();
			topStudentName=entry.getKey();
		}
		}
		return topStudentName;
	}

}
