//Pattern
import java.util.*;
class Q1 {
public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the no. of rows: ");
	int rows = sc.nextInt();
	for (int i = 1; i<=rows; i++) 
	{
		for (int j = 1; j <= i; j++) {
		System.out.print("* ");	
	}
	System.out.println();
	}
}
}
//Time Complexity: O(n^2)
//Space Complexity: O(1)