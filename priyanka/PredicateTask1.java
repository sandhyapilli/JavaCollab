package priyanka;

import java.util.function.Predicate;

public class PredicateTask1 {
    public static void main(String[] args) {
		String[] names= {"Anushka", "Anupama", "Deepika", "kajal","sunny"};
		Predicate<String> p=name -> name.charAt(0)=='A';
		for(String name:names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
