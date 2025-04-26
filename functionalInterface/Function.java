package functionalInterface;

import java.util.function.ToIntFunction;

public class Function {
	public static void main(String args[]) {
		
		ToIntFunction<String> f=s->s.length();
		System.out.println(f.applyAsInt("Sandhya"));
	}//here we shouldn't add another wrapper inside generics beacuase ToIntFunction is used to return integer type.

}
