package programs;

public class LeapYear {
	public static void main(String[] args) {
		int year=2025;
		if(year%4==0) {
			System.out.println("leap year");
		}
		else if(year%100==0) {
			System.out.println("Not a leap year");
		}else 
		if(year%400==0) {
			System.out.println("Leap year");
		}
	}

}
