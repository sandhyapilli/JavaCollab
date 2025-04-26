package task3;

public class Example {
public static void main(String[] args) {
	BankAccount b=new BankAccount(123457657L, 20000.00, "Sandhya" );
	BankAccount c= new BankAccount(234346556L, 15000.00, "Siri");
	b.deposit(15000);
	c.withdraw(5000);
}
}
