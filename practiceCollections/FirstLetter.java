package practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
public static void main(String[] args) {
	List<String> words= new ArrayList<>();
	words.add("Sandy");
	words.add("Sravs");
	words.add("Siri");
	words.add("Aishu");
	List<Character> firstLetter= getFirstLetter(words);
	System.out.println(firstLetter);
}
       public static List<Character> getFirstLetter(List<String> words){
    	   List<Character> list= new ArrayList<>();
    	   for(String word:words) {
 	    if(word!=null && !word.isEmpty()) {

 	   list.add(word.charAt(0));
	}
     } return list;   
}}
