package practiceCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LIstD {
	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(12,34,56,23,12,34,56);
		Set<Integer> unique=new HashSet<>(numbers);
		System.out.println("original"+numbers);
		System.out.println("unique elements"+unique);
		
	}

}
