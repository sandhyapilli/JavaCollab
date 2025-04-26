package priyanka;

public class ExceptionTask3 {
	
	
	public static void checkEligibility(int age) throws IllegalArgumentException{
		
	if(age<18) {
		throw new IllegalArgumentException("-Age is invalid");
	}else {
		System.out.println("Eligible for vote");
	}
}
	
	public static void main(String[] args) {
		try {
			checkEligibility(16);
		}catch(IllegalArgumentException e){
			System.out.println("Age is under 18"+e.getMessage());
		}
	}
	
	}

