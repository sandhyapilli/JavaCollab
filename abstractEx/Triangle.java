package abstractEx;

 class Triangle extends Shape {
	 

	@Override
	void calculateArea() {
		int b,h;
		b=10;h=20;
		int c=b*h*(1/2);
		System.out.println("Area of Triangle is"+c);
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculatePerimeter() {
		int a,b,c,d;
		a=10; b=300; c=18; 
		d= a+b+c;
		System.out.println("Perimeter of Triangle is:"+d);
		// TODO Auto-generated method stub
		
	}
	

}
