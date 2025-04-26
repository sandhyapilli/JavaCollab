package priyanka;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTask3 {
String name;
@Override
public String toString() {
	return "PredicateTask3 [name=" + name + ", location=" + location + ", dept=" + dept + "]";
}
String location;
String dept;
PredicateTask3(String name, String location, String dept){
	this.name=name;
	this.location=location;
	this.dept=dept;
}
public static void main(String[] args) {
	PredicateTask3 p1= new PredicateTask3("Sandhya", "Hyderabad","IT" );
	PredicateTask3 p2= new PredicateTask3("Siri","Hyderabad","IT");
			PredicateTask3 p3= new PredicateTask3("Vinay", "Madhapur", "Non-IT");
			PredicateTask3 p4= new PredicateTask3("Usha","Chennai","Non-IT");
			PredicateTask3 p5= new PredicateTask3("Aishu","Lingampally","Studying");
			List<PredicateTask3> list=Arrays.asList(p1,p2,p3,p4,p5);
		
			Predicate<PredicateTask3> predicate1=p->p.location.equals("Hyderabad");
			Predicate<PredicateTask3> predicate2=p->p.dept.equals("IT");
			Predicate<PredicateTask3> predicate3=predicate1.and(predicate2);
			for(PredicateTask3 e:list) {
				if(predicate3.test(e)) {
					System.out.println(e);
				}
			
					}
}
}