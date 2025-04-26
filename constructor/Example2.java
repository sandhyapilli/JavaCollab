package constructor;

public class Example2 {
     int a;
     int b; 
     int f;
      Example2(int c,int d) {
    	  int a=c;
    	  int b=d;
    	System.out.println("The elements are:"+a +" "+b);
     }
      Example2(int c,int d,int e){
    	  int a=c;
    	  int b=d;
    	  int f=e;
    	  System.out.println("The next elements are:"+a +" "+b +" "+c);
      }
      public static void main(String args[]) {
    	  Example2 e= new Example2(1,2);
    	  Example2 w1=new Example2(1,2,3);
    	  
      }
}
