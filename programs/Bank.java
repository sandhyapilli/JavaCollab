package programs;

public class Bank {
  private int balance;
  public  Bank(int balance) {
	  this.balance=balance;
	  
  }
  public void withdraw(int amount) throws CustomException {
	  if(balance==0) {
		  throw new CustomException("No amount "+balance);
	  }else if(balance<amount){
		  throw new CustomException("Insufficient balance and the balance is:"+balance);
	  }
	  balance-=amount;
	  System.out.println("The balance is "+balance);
  }
}