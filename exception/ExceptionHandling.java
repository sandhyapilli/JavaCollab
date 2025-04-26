 package exception;

public class ExceptionHandling {
   public void run() {
	   System.out.println("Its about to execute");
   
     try {
     int a=2;
     int b=2;
     int c=b/a;
     }catch(ArithmeticException e) {
    	 System.out.println("Divided by zero"+e.getMessage());
     }
   finally {
	   System.out.println("Its get executed");
   }
   }
     public static void main(String args[]) {
    	 ExceptionHandling e= new ExceptionHandling();
    	 e.run();
    	
     }

   }

	