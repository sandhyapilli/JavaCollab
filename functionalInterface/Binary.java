package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Binary {
    public static void main(String args[]) {
//    	BiFunction<String,String,String> f=(s1,s2)->s1+s2;
//    	System.out.println(f.apply("Sandhya", "Pilli"));
    	BinaryOperator<String> b=(s1,s2)->s1+s2;
    	System.out.println(b.apply("Sirisha", "Pilli"));

    }
}
