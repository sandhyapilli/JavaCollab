package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastName {
public static void main(String[] args) {
	List<String> elements= Arrays.asList("sandhya pilli", "usha dhivish", "priyanka vishnumahanthi");
	List<String> result=elements.stream()
			
	        .map(names->names.substring(names.lastIndexOf(" ") +1)).collect(Collectors.toList());
	System.out.println(result);
	        		
}
}