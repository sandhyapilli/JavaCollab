package comparator;


import java.util.TreeSet;

public class Tester {
	public static void main(String args[]) {
		TreeSet<Student> t= new TreeSet<Student>(new NameComparator());
		t.add(new Student(20,"Siri",423));
		t.add(new Student(22,"Sravs",300));
		t.add(new Student(23,"Sandy",120));
		t.add(new Student(24,"Priyanka",121));
		for(Student s:t) {
			System.out.println(+s.age+ " "+s.name+" "+s.rollno);
		}
	}

}
