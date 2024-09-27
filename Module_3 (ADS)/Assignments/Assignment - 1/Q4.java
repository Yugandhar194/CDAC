import java.util.*;
class Q4 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number upto which you want Fibonacci series");
	int n = sc.nextInt();
	int a=0, b=1;
	System.out.println("Fibonacci series till: "+n+" terms");
		for (int i=0; i<=n; i++) {
		System.out.print(a + " ");
		int c = a + b;
		a = b;
		b = c;
		}
	}
}
// Time Complexity  O(n)
// Space Complexity O(1)