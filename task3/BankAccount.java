package task3;

public class BankAccount {
private Long accountNumber;
private Double balance;
private String accountHolder;
public BankAccount(Long accountNumber, Double balance, String accountHolder) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.accountHolder = accountHolder;
}
public Long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(Long accountNumber) {
	this.accountNumber = accountNumber;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}

public double deposit(double amount) {
	if(amount>0) {
	balance=balance+amount;
	System.out.println("the total balance is:"+balance);
	}else {
		System.out.println("Invalid amount");
	}
	return balance;
}
public double withdraw(double amount) {
	if(balance>amount) {
		balance-=amount;
		System.out.println("The balance is:"+balance);
	}else {
		System.out.println("Insufficient balance");
	}
	return balance;
}
public double getTotalBalance() {
	
	return balance;
}

}
