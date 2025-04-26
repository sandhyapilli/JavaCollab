package priyanka;
import java.util.function.Consumer;
public class ConsumerTask {
public static void main(String[] args) {
	Consumer<String> c=(name)->System.out.println(name+"Good Morning");
	c.accept("Sandhya ");
	
}
}
