package priyanka;
import java.util.function.*;
public class BiFunctionTask {
public static void main(String[] args) {
//	BiFunction<Integer,Integer,Integer> d=(a,b)->(a+b);
//	System.out.println(d.apply(12, 34));
	Supplier<Double> result= ()-> Math.random();
	System.out.println(result.get());
	
}
}
