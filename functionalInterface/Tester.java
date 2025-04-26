package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Tester {
   public static void main(String args[]) {
	   Function<Student,String> f=s->{
		   int marks=s.marks;
		   String grade=" ";
		   if(marks>=80) grade="A[Distinction]";
		   else if(marks>=60) grade="B[First class]";
		   else if(marks>=50) grade="C[Second class]";
		   else if(marks>=35) grade="D[Third class]";
		   else grade="E[Failed]";
		   return grade;
		   
	   };
	   Predicate<Student> p=s->s.marks>=60;
	   Consumer<Student> a=s1->{
		   System.out.println("Student name:"+s1.name);
		   System.out.println("Student marks:"+s1.marks);
		   System.out.println("Grade:"+f.apply(s1));
	   };
	   
	   Student[] s= {new Student(100,"siri"),
			        new Student(65,"Sravs"),
			        new Student(35,"sandy"),
			        new Student(50,"Aishu"),
			        new Student(0,"anjali")};
	   for(Student b:s) {
//		   if(p.test(s1)){
//		   System.out.println("Student name:"+s1.name);
//		   System.out.println("Student marks:"+s1.marks);//it is for function 
//		   System.out.println("Grade:"+f.apply(s1));
		   a.accept(b); //it is for Consumer.Consumer is just for printing 
	   
		}
   }}
                     
                                