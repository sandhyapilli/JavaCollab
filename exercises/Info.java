package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Info {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(1,"Sandy","F",18000));
	list.add(new Employee(3,"Siri","F",20000));
	list.add(new Employee(5,"Dinesh","M",30000));
	list.add(new Employee(2,"Harsha","M",40000));
	list.add(new Employee(4,"Aishu","F",100000));
	int maleCount=0;
	int femaleCount=0;
	Iterator<Employee> l1=list.iterator();
	while(l1.hasNext()) {
		Employee infor=l1.next();
		if(infor.getGender().equals("F")) {
			femaleCount++;
		}else if(infor.getGender().equals("M")) {
			maleCount++;
		}}
	System.out.println(femaleCount+" "+maleCount);
			
		}
}

