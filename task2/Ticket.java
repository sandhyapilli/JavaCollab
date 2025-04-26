package task2;

public abstract class Ticket {
	private String availableTickets;
	private Double price;
	private String name;
public Ticket(String availableTickets, Double price, String name) {
	this.availableTickets=availableTickets;
	this.price = price;
	this.name = name;
}
public String getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(String availableTickets) {
		availableTickets = availableTickets;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public abstract void getTicketDetails();
public abstract void CalculatePrice();
@Override
public String toString() {
	return "Ticket [AvailableTickets=" + availableTickets + ", price=" + price + ", name=" + name
			+ ", getAvailableTickets()=" + getAvailableTickets() + ", getPrice()=" + getPrice() + ", getName()="
			+ getName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
