package abstractEx;

class Rectangle extends Shape {

	@Override
	void calculateArea() {
		int l,b;
		l=10;
		b=20;
		System.out.println("Area of Rectangle"+l*b);
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculatePerimeter() {
		int l,b;
		l=30; b=40;
		int d=(l+b)*2;
		System.out.println("Perimeter of Rectangle"+d);
		// TODO Auto-generated method stub
		
	}

}
