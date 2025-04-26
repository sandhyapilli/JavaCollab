package task2;

public class Example {
public static void main(String[] args) {
	Ticket t= new TrainTicket("2", 23432.00, "Train");
	t.getTicketDetails();
	t.CalculatePrice();
	Ticket B= new BusTicket("5", 5043.9, "Bus");
	B.getTicketDetails();
	B.CalculatePrice();
}
}
