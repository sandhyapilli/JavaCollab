package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWords {
public static void main(String[] args) {
	
	        String sentence = "Java is a programming language. Java is used for building applications.";

	        // Split the sentence into words
	        String[] words = sentence.split(" ");

	        // Use a HashSet to store unique words
	        LinkedHashSet<String> wordSet = new LinkedHashSet<>();//here why we used linked Hashset is :to print the output in preserved order

	        // Add words to HashSet (automatically removes duplicates)
	        for (String word : words) {
	            wordSet.add(word);
	        }

	        // Build the result string
	        StringBuilder result = new StringBuilder();
	        for (String word : wordSet) {
	            result.append(word).append(" ");//the reason for using second append is to add white space after each word 
	        }

	        // Trim any trailing whitespace and print the result
	        String finalSentence = result.toString().trim();
	        System.out.println("Original Sentence: " + sentence);
	        System.out.println("Sentence without Duplicates: " + finalSentence);
	    }
	

   
    
} 

