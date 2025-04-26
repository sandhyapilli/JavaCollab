package abstractEx;

class Circle extends Shape{
	float r;

	@Override
	void calculateArea() {
		float d=3.14f;
		float c=(r*r*r);
		float e=d*c;
		System.out.println("Area of Circle"+e);
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculatePerimeter() {
		float pi=3.14f;
		int r=5;
		float e=2*pi*r;
		System.out.println("perimeter of circle"+e);
		// TODO Auto-generated method stub
		
	}

}
