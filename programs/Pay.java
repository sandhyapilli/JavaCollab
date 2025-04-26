package programs;

public class Pay {
public static void main(String args[]) {
	Bank b= new Bank(10);
	try {
		b.withdraw(0);
	}catch(CustomException e){
		System.out.println(e.getMessage());
	}
	try {
		b.withdraw(1500);
	}catch(CustomException e) {
		System.out.println(e.getMessage());
	}
	try {
	b.withdraw(1);
	}catch(CustomException e) {
		System.out.println(e.getMessage());
}
}
}
