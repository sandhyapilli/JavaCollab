package functionalInterface;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String args[]) {
		Consumer<String> a=s->System.out.println(s);
		a.accept("sandhya");
		a.accept("Siri");
		a.accept("Sravs");
	}

}
