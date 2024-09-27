import java.util.*;
class Q1 {	//armstrong number
public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	int a,b, d, sum = 0;
	System.out.println("Enter a number");
	b = sc.nextInt();
	a = b;
	while (b > 0)
	{
		d = b % 10;
		sum = sum+(d*d*d);
		b = b / 10;
	}
	if (a  == sum)
		System.out.println(true);
	else
		System.out.println(false);
	}
}
// Time Complexity  O(n)
// Space Complexity O(1)