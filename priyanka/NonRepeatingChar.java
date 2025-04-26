package priyanka;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
	
	public static void main(String[] args) {
		String s="saanndyys";
//		for(int i=0;i<s.length();i++) {
//			char characterCount=s.charAt(i);
//			Boolean isRepeating=false;
//			for(int j=0;j<s.length();j++) {
//				if(i!=j && characterCount==s.charAt(j)) {
//					isRepeating=true;
//					break;
//				}
//			}
//		if(!isRepeating) {
//			System.out.println(characterCount);
//			break;
//		}}
		Map<String, Integer> list= new HashMap<>();
	      for(char c:s.toCharArray()) {
	    	  list.put(String.valueOf(c), list.getOrDefault(String.valueOf(c), 0)+1);
	      }for(Map.Entry<String, Integer> result:list.entrySet()) {
	    	  if(result.getValue()==1) {
	    		  System.out.println(result.getKey());
	    	  }
	      }
		}}	
    	
		
	  
		
	

