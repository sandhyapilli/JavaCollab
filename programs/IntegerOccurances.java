package programs;

import java.util.HashMap;
import java.util.Map;

public class IntegerOccurances {
  public static void main(String args[]) {
	  int a[]= {2,3,4,5,7,2,3,4};
	  HashMap<Integer, Integer> occurances=new HashMap<Integer,Integer>();
	  for(int num:a) {
		  occurances.put(num,occurances.getOrDefault(num, 0)+1);
	  }for(Map.Entry<Integer, Integer> result:occurances.entrySet()) {
		  System.out.println(result.getKey()+" occurs "+result.getValue()+ " times ");
	  }
  }
}
