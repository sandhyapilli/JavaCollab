package functionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Ex {
	public static void main(String args[]) {
		ArrayList<EmployeeEx> l=new ArrayList<EmployeeEx>();
		populate(l);
		BiConsumer<EmployeeEx,Double> c=(e,d)->e.salary=e.salary+d;
		for(EmployeeEx e:l) {
			c.accept(e, 500.0);
		}
		for(EmployeeEx e:l) {
			System.out.println(e.name);
			System.out.println(e.salary);
		}
	}public static void populate(ArrayList<EmployeeEx> l)
	{
		l.add(new EmployeeEx("Sandhya",10000));
		l.add(new EmployeeEx("Siri",20000) );
		l.add(new EmployeeEx("Sravs",13300));
		l.add(new EmployeeEx("Sailu",12000));
	}
	

}
