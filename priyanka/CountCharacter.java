package priyanka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacter {
public static void main(String[] args) {
	//String name="SandhyaPilli";
	
//	for(int i=0;i<name.length();i++) {
//	char ch=name.charAt(i);
//	int count=0;
//	for(int j=0;j<name.length();j++) {
//	if(name.charAt(j)==ch) {
//		count++;
//	}}
//	System.out.println(ch+":"+count);
//}
//	Map<String, Integer> list= new HashMap<>();
//	for(char words:name.toCharArray()) {
//		list.put(String.valueOf(words), list.getOrDefault(String.valueOf(words), 0)+1);
//	}
//	for(Map.Entry<String, Integer> result:list.entrySet()) {
////		if(result.getValue()>1) {
////			System.out.println(result.getKey());
////		}
//		System.out.println(result.getKey()+":"+result.getValue());
//	}
	
	String s="sandhya";
	Map<String, Integer> list= new HashMap<>();
	for(char words:s.toCharArray()){
	list.put(String.valueOf(words),list.getOrDefault(String.valueOf(words),0)+1);
	}
	for(Map.Entry<String, Integer> result:list.entrySet()){
	if(result.getValue()>1){
		
	System.out.println(result.getKey());
}}}}
