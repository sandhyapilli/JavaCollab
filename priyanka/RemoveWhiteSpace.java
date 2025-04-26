package priyanka;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	String str="Java Programming language";
	String result=str.replaceAll("\\s", "");
	System.out.println(result);
}
}
