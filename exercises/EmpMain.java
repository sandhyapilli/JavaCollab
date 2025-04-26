package exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpMain {
public static void main(String[] args) {
	List<Emp> list= new ArrayList<Emp>();
	list.add(new Emp(1,"sandy",23,"F",180000));
	list.add(new Emp(2,"siri",21,"F",20000));
	list.add(new Emp(3,"sravs",22,"F",21000));
	list.add(new Emp(4,"harsha",19,"M",300000));
	list.add(new Emp(5,"Rajesh",20,"M",120000));
	list.add(new Emp(6,"Rishi",24,"M",190000));
	 int maleSalary=0;
	 int femaleSalary=0;
	 int MaleCount=0;
	 int FemaleCount=0;
	Iterator<Emp> itr=list.iterator();
	while(itr.hasNext()) {
		Emp e=itr.next();
		if(e.getGender()=="M") {
			maleSalary=+maleSalary+e.getSalary();
			MaleCount++;
		}else {
			femaleSalary=+femaleSalary+e.getSalary();
			FemaleCount++;
		}
	}System.out.println("Male count is:"+MaleCount+" Female count is:"+FemaleCount);
	System.out.println("And their salries are:"+maleSalary+" & "+femaleSalary);
}
}
