package priyanka;

public class CopyCar {
private String model;
private int year;
private double price;
 public CopyCar(String model, int year, double price) {
	 this.model=model;
	 this.year=year;
	 this.price=price;
 }
	 public CopyCar(CopyCar copy) {
		 this.model=copy.model;
		 this.year=copy.year;
		 this.price=copy.price;
	 }
	 public void getResult() {
		 System.out.println("car model:"+model);
		 System.out.println("year of manufacturing:"+year);
		 System.out.println("price of the car:"+price);
	 }
	 public static void main(String[] args) {
		CopyCar result=new CopyCar("B&W", 2001, 500000.0);
		CopyCar result1=new CopyCar("skoda", 2020, 600000.0);
		result.getResult();
		result1.getResult();
		CopyCar copied= new CopyCar(result);
		copied.getResult();
	}
 }

