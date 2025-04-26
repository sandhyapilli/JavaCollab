package tasksChatGpt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
 private int id;
 private Double salary;
 private String name;
 private String department;
 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}


 public Employee(int id,Double salary, String name, String department) {
	 this.id=id;
	 this.salary=salary;
	 this.name=name;
	 this.department=department;
 }
 @Override
 public String toString() {
     return "Employee{id=" + id + ", salary=" + salary + ", name='" + name + "', department='" + department + "'}";
 }

public static void main(String args[]) {
	List<Employee> list= new ArrayList<>();
	list.add(new Employee(1,23434.34, "sandy", "IT"));
	list.add(new Employee(2, 3423434.3, "siri", "Non-IT"));
	list.add(new Employee(3,67544.34, "sravs", "IT"));
	list.add(new Employee(4, 1423434.3, "Aishu", "Non-IT"));
	
//	list.stream().filter(i->i.getSalary()>50000.00).forEach(System.out::println);
	
//	Map<String, List<Employee>> groupedList=list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//     groupedList.forEach((department,empList)->{System.out.println("Department"+department);
//     empList.forEach(System.out::println);
//     });
//     }
     list.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
	}
}