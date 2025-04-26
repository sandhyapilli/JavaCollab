package priyanka;

public class BankEncaps {
private Long accountNumber;
private String acountHolderName;
private Double balance;
public Long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(Long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAcountHolderName() {
	return acountHolderName;
}
public void setAcountHolderName(String acountHolderName) {
	this.acountHolderName = acountHolderName;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public Double BankBalance(double balance) {
	balance=balance+1;
	return balance;
}
}
