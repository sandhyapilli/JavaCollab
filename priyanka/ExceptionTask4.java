package priyanka;

public class ExceptionTask4 {
	
static void withdraw(int amount) throws InsufficientFundsException{
	int balance=10000;
	if(balance<amount) {
		throw new InsufficientFundsException("balance is lesser than amount you entered");
	}
	else {
		System.out.println("withdraw successful");
	}balance-=amount;
	System.out.println("The balance is"+balance);
}
public static void main(String[] args) {
//	int balance=10000;
	try {
	withdraw(5000);
	}
	catch(InsufficientFundsException e) {
		System.out.println(e.getMessage());
	}
}
}
