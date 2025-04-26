package priyanka;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTask2 {
String name;
int age;
    PredicateTask2(String name, int age){
	this.name=name;
	this.age=age;
	
}
    public static void main(String[] args) {
		PredicateTask2 p4= new PredicateTask2("Sandy",24);
		PredicateTask2 p1= new PredicateTask2("Siri",22);
		PredicateTask2 p2= new PredicateTask2("Aishu",16);
		PredicateTask2 p3= new PredicateTask2("Rishika",3);
		List<PredicateTask2> persons= Arrays.asList(p4,p1,p2,p3);
		Predicate<PredicateTask2> predicate=p->p.age>=18;
		for(PredicateTask2 result:persons) {
			if(predicate.test(result)) {
				System.out.println(result.name);
			}
		}
	}
}
