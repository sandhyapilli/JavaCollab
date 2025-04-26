package comparatorMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
     public static void main(String args[]) {
    	 TreeMap<Integer,Employee> t= new TreeMap<>();
    	Employee e1= new Employee(1206350,18000,"Sandhya","SSA");
    	Employee e2= new Employee(1206351,18060,"Priyanka","SA");
    	Employee e3= new Employee(1206356,19000,"Yamini","SA");
    	Employee e4=new Employee(1206533,20000,"Moonu","SE");
    	
    	t.put(1, e1);
    	t.put(3, e3);
    	t.put(2, e2);
    	t.put(4, e4);
    	
//    	Set s=t.entrySet();
//     	Iterator i=s.iterator();
//     	while(i.hasNext()) {       //instead of doing all this easily we can use forEach loop.
    	for(Map.Entry<Integer, Employee> tr:t.entrySet()) {
     	//Map.Entry<Integer,Employee> tr=(Map.Entry<Integer, Employee>)i.next();
     	int key=tr.getKey();
     	Employee e=tr.getValue();
     	
     	System.out.println(e.empId+", "+e.salary+",  "+e.empName+", "+e.Designation);
    	
    	 
     }
}}
