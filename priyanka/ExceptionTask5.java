package priyanka;

public class ExceptionTask5 {
static void registerUser(int age) throws InvalidAgeException{
	if(age<18) {
		throw new InvalidAgeException("Age is under 18. So, Not eligible to register");
	}else {
		System.out.println("Registered Successfully");
	}
}public static void main(String[] args) {
	try {
		registerUser(12);
	}catch(InvalidAgeException e){
		System.out.println(e.getMessage());
	}
}
}
