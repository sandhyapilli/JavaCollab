package priyanka;

public class SetOfNames {
public static void main(String[] args) {
	String[] s= {"sandhya","sirisha", "sravanthi","sirisha"};
	for(String result:s) {
		System.out.println(result.substring(0, 1).toUpperCase()+result.substring(1, result.length()));
	}
}
}
