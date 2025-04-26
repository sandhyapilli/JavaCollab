package comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {
	
	 
	public int compare(Student s1, Student s2) {
	   if(s1.name.compareTo(s2.name)>0) {
		   return 1;
	   }else if(s1.name.compareTo(s2.name)<0) {
		   return -1;
	   }else
		   return 0;
	
	}

	

}
