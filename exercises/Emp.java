package exercises;

import java.util.ArrayList;
import java.util.List;

public class Emp {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
private String name;
private int age;
private String Gender;
private int salary;
public Emp(int id, String name, int age, String gender, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.Gender = gender;
	this.salary = salary;
}

}
