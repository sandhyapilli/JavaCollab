package variables;

public class StaticEx {
    
    	private static int count=0;
    	public static void incrementCount() {
    		count++;
    		System.out.println(count);
    	}
    	public static int getCount() {
    		return count;
    		
    	}
    }

