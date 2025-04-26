package looping;

public class SwitchEXA {
public static void main(String[] args) {
	int number=4;
	String dayName;
	switch(number) {
	case 1:
		dayName="Monday";
		break;
	case 2:
		dayName="Tuesday";
		break;
	case 4:
		dayName="Thursday";
		break;
	case 5:
		dayName="Friday";
		break;
	case 6:
		dayName="Saturday";
		break;
	case 7:
		dayName="Sunday";
		break;
		default:
			dayName="Day is Invalid";
			
	}System.out.print(dayName);
}
}
