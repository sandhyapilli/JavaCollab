package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfO {
   public static void main(String[] args) {
	   
	String str="welcome to the monocept";
	 
     int count = 0;

     for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
             count++;
         }
     }

     System.out.println("Number of times 'o' appears: " + count);
 }
	
//Long count=str.chars().filter(i->i=='o').count();
//System.out.println(count);
	
}
