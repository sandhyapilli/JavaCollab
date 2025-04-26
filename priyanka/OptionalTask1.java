package priyanka;

import java.util.Optional;
import java.util.Scanner;

public class OptionalTask1 {
private Integer id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String name;
private String email;
public OptionalTask1(Integer id, String name, String email) {
	this.id=id;
	this.name=name;
	this.email=email;
	
}
public static void main(String[] args) {
	OptionalTask1 opt= new OptionalTask1(1,"Sandhya","abc@gmail.com");
	OptionalTask1 opt1= new OptionalTask1(2,"priya","abc@gmail.com");
	OptionalTask1 opt2= new OptionalTask1(3,"sravs","abc@gmail.com");
	OptionalTask1 opt3= new OptionalTask1(4,"priyanka","abc@gmail.com");
	OptionalTask1 opt4= new OptionalTask1(5,"siri","abc@gmail.com");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your ID:");
	Integer id=opt.getId();
	Optional<Integer> result=Optional.of(opt.getId());
	if(result.isPresent()) {
	System.out.println(result);
}else {
	System.out.println("Data is not present");
}
}}
