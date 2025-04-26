package functionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;
public class BiFunctionEx {
	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		
		BiFunction<Integer,String,Employee> f=(eno,name)->new Employee(eno,name);
		l.add(f.apply(100, "Sandy"));
		l.add(f.apply(400, "Siri"));
		l.add(f.apply(234, "Sravs"));
		l.add(f.apply(600, "Aishu"));
		
		for(Employee e:l){
			System.out.println("Employee number:"+e.eno);
			System.out.println("Employee name:"+e.name);
			
		}
		
	}

}
