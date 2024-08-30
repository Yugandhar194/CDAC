import java.util.*;
class Week {
	public static void main (String args[]) {
		int day=7;
		Scanner sc = new Scanner(System.in);
		switch(day) {
		case 1:
		System.out.println("Monday");
		break;
		case 2:
		System.out.println("Tuesday");
		break;
		case 3:
		System.out.println("Wednesday");
		break;
		case 4:
		System.out.println("Thursday");
		break;
		case 5:
		System.out.println("Friday");
		break;
		case 6:
		System.out.println("Saturday");
		break;
		case 7:
		System.out.println("Sunday");
		break;
		default:
		System.out.println("Invalid");
		break;
		}
		if (day==6 || day==7) {
			System.out.println("It is weekend");
		}
		else {
			System.out.println("It is Weekday");
		}
	}
}