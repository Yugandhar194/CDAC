import java.util.*;
class rect {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		int length = sc.nextInt();
		System.out.println("Enter the width of rectangle: ");
		int width = sc.nextInt();
		int Area = length * width;
		System.out.println("Area of rectangle is: "+Area);
	}
}