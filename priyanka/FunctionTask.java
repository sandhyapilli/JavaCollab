package priyanka;

import java.util.function.Function;

public class FunctionTask {
public static void main(String[] args) {
	Function<String, String> f=(name)->"Hello"+name;
	System.out.println(f.apply("Sandhya"));
}
}
