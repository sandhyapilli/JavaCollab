package nisum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Employee> list= new ArrayList<Employee>();
	list.add(new Employee("Sandy",123333.90,1));
	list.add(new Employee("Siri", 1300000.23,2));
	list.add(new Employee("Sravs", 180000.12,3));
	 Double secondHighestSalary=list.stream()
	                                                 .mapToDouble(Employee::getSalary)
	                                                 .distinct()
	                                                 .boxed()
	                                                 .sorted(Comparator.reverseOrder())
	                                                 .skip(1)
	                                                 .findFirst()
	                                                 .orElse(Double.NaN);
	if(Double.isNaN(secondHighestSalary)){
	System.out.println("Second highest salary is null");
	}
	else{
	System.out.println(secondHighestSalary);
	}}
}

