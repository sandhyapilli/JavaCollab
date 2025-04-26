package functionalInterface;

import java.util.Date;

import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String args[]) {
		
		
//		Supplier<Date> d=()->new Date();
//		System.out.println(d.get());
//		System.out.println(d.get());
//		System.out.println(d.get());
//		System.out.println(d.get());
//		System.out.println(d.get());
		
		Supplier<String> s=()->{
			String otp=" ";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get()); //it will give random numbers...
	}

}
