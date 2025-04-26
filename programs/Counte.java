package programs;

public class Counte {
public static void main(String[] args) {

	        String s1 = "Sandy";
	        String s2 = "Candy";
	        
	        int matchingCount = countMatchingCharacters(s1, s2);
	        
	        System.out.println("Number of matching characters: " + matchingCount);
	    }
	    
	    public static  int countMatchingCharacters(String s1, String s2) {
	        int count = 0;
	        
	        // Ensure strings are of equal length for comparison
	        int length = Math.min(s1.length(), s2.length());
	        
	        // Iterate through each character in both strings
	        for (int i = 0; i < length; i++) {
	            // Check if characters at the same index are equal
	            if (s1.charAt(i) == s2.charAt(i)) {
	                count++;
	            }
	        }
	        
        return count;//Considering the analysis above, the overall time complexity of the countMatchingCharacters method is O(min(n, m)), where n and m are the lengths of the input strings s1 and s2.
//
//In terms of space complexity, the algorithm uses a constant amount of additional space for variables (count, length, i), so it has a space complexity of O(1), indicating it's constant space complexity.
  }
	}
