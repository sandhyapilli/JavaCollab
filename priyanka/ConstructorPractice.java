package priyanka;

public class ConstructorPractice {

	private String title;
	private String author;
	private double price;
	public ConstructorPractice() {
		this.title="unknown title";
		this.author="unknown author";
		this.price=0.0;
	}
	public ConstructorPractice(String title, String author, double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public ConstructorPractice(String title, String author) {
		this.title=title;
		this.author=author;
		this.price=500.00;
	}
	public void getDetails() {
		System.out.println("The name of the title:"+title);
		System.out.println("name of the author:"+author);
		System.out.println("price is:"+price);
	}
	public static void main(String[] args) {
		ConstructorPractice b=new ConstructorPractice();
		b.getDetails();
		ConstructorPractice c= new ConstructorPractice("Book", "priyanka", 2000.00);
		c.getDetails();
		ConstructorPractice d= new ConstructorPractice("physics", "sandhya");
		d.getDetails();
	}
}

