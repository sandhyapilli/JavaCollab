package task2;

public class BusTicket extends Ticket {
	
public BusTicket(String availableTickets, Double price, String name) {
		super(availableTickets, price, name);
		// TODO Auto-generated constructor stub
	}
//public BusTicket(String availableTickets, Double price, String name) {
//		super(availableTickets, price, name);
//		// TODO Auto-generated constructor stub
//	}
@Override
public void getTicketDetails() {
	System.out.println("Available tickets are:"+getAvailableTickets());
	System.out.println("price:"+getPrice());
	System.out.println("name:"+getName());
}
@Override
public void CalculatePrice() {
	System.out.println(getPrice());
}
}