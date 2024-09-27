import java.util.*;
class Q2 //prime 
{
	public static void main (String args[] ) {
	System.out.println("Take any number of your choice to check prime: ");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	boolean flag = false; //set default value of boolean as false
	for (int i=2; i <=num/2; i++) {
	if (num % i == 0) {
	flag = true;
	break;
	}
	}
	if (!flag) 
	System.out.println(true);
	else
	System.out.println(false);
	}
}
// Time Complexity  O(n)
// Space Complexity O(1)