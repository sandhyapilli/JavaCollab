package wrapperClass;

public class Example {
	public static void main(String args[]) {
      int a=10;
      Integer b=Integer.valueOf(a);
      System.out.println(b); //wrapping primitive into object
      
      int c=b.intValue();
      System.out.println(c);  //converting Integer object into int (unwrapping)
      
      //AutoBoxing:
      Integer d=a;
	//AutoUnBoxing
      int e=d;
      
      //wrapperClass:Boolean
      Boolean wrappedBoolean=Boolean.valueOf(false);
      System.out.println(wrappedBoolean);
      
      //wrapperClass:character
      Character i=Character.valueOf('A');
      System.out.println(i);	}
}
