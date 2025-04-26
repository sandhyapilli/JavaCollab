package exception;

public class Test {
	public static void main(String args[]) throws Exception {
		ThrowException t= new ThrowException();
		t.Exception();
		try {
			int a=10;
	    	 int b=0;
	    	int c=a/b;
	    	System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("Divided by zero"+e.getMessage());
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(" AIOBE"+a.getMessage());
		}
		
	}

}
