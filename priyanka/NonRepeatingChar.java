package priyanka;

public class NonRepeatingChar {
	
	public static void main(String[] args) {
		String s="sandys";
		for(int i=0;i<s.length();i++) {
			char characterCount=s.charAt(i);
			Boolean isRepeating=false;
			for(int j=0;j<s.length();j++) {
				if(i!=j && characterCount==s.charAt(j)) {
					isRepeating=true;
					break;
				}
			}
		if(!isRepeating) {
			System.out.println(characterCount);
			break;
		}}
		
		}}	
    	
		
	  
		
	

