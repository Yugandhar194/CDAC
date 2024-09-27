import java.util.*;
class Q6  {  
//Square root
	public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number whose square root you want: ");
	double x = sc.nextDouble();
	double ans = (int) Math.sqrt(x);	//narrowing conversion - data type
	System.out.println(ans);
	}
}
// Time Complexity  O(1)
// Space Complexity O(1)