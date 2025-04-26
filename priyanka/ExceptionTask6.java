package priyanka;

public class ExceptionTask6 {
	static void withdraw(int amount) throws InsufficientFundsException, IllegalArgumentException{
	int balance=10000;
	if(balance<amount) {
		throw new InsufficientFundsException("balance is lesser than amount you entered");
	}
	else if(amount<0){
		throw new  IllegalArgumentException("the entered amount is negative");
	}
	
		balance-=amount;
	
	System.out.println("The balance is:"+balance);
}
public static void main(String[] args) {
//	int balance=10000;
	try {
		withdraw(8000);
	}
	catch(InsufficientFundsException e) {
		System.out.println(e.getMessage());
	} catch (IllegalArgumentException e) {
	
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Transaction Completed");
	}
	}
}


