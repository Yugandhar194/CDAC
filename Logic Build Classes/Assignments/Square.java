import java.util.*;
class sqr {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the side of square: ");
		int A;
		int side = sc.nextInt();
		A = side*side;
		System.out.println("Area of square is: "+A);
	}
}