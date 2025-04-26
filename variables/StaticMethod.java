package variables;

public class StaticMethod {
	public static void Static() {
		System.out.println("Priyanka");
	}
	public void nonStatic() {
		System.out.println("Rama");
	}
	public static void main(String args[]) {
		StaticMethod m= new StaticMethod();
		System.out.println("Sandhya");
		m.nonStatic();
		Static();
	}
}
