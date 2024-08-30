import java.util.*;
class Q1{	//Sum of first 50 natural numbers
	public static void main (String args[]) {
			int n, sum;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of n: ");
			n = sc.nextInt();
			sum = n*(n+1)/2;
			System.out.println("Sum of first "+n+" natural numbers: " +sum);
	}
}