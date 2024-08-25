import java.util.*;
class GM {
	public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any time: ");
	int time = sc.nextInt();
	if (time > 5 && time < 12)
	 {
		System.out.println("Good morning");
	 }
	else
	 {
		System.out.println("This is not morning");
	 }
	}
}