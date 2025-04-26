package functionalInterface;

import java.util.function.Consumer;

public class Example1 {
	public static void main(String args[]) {
		Movie m=new Movie("Oye");
		Consumer c1=s->System.out.println(m.movie+",Movie is good");
		Consumer c2=s->System.out.println(m.movie+" Yes, it's good");
		Consumer c3=s->System.out.println(m.movie+"  !!Yeah, Good..");
		Consumer cc=c1.andThen(c2).andThen(c3);
		
		cc.accept(m);
	}

}
