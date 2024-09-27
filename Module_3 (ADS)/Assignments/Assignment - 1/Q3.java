import java.util.*;
class Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number whose factorial you want: ?");
		int fact=1;
		int n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the number " +n+ " is " +fact);
	}
}
// Time Complexity  O(n)
// Space Complexity O(1)