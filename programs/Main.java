package programs;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	
	    public static void main(String[] args) {
	        ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Alice", 50000, 1));
	        employees.add(new Employee("Bob", 60000, 2));
	        employees.add(new Employee("Charlie", 45000, 3));
	        employees.add(new Employee("David", 70000, 4));

	        // Find the second largest salary using streams
	        double secondMaxSalary = employees.stream()
	                .mapToDouble(Employee::getSalary)
	                .distinct()
	                .boxed() //convert stream of primitive objects into stream of double objects.
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .orElse(Double.NaN);

	        // Check if a second maximum salary exists
	        if (Double.isNaN(secondMaxSalary)) {  //NaN means not a number
	            System.out.println("No second largest salary");
	        } else {
	            System.out.println("Second largest salary: " + secondMaxSalary);
	        }
	    }
	}

