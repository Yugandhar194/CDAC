import java.util.*;
class Q4 {		//Reverse number
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num != 0)
		{
			int x = num%10;
			rev = rev*10+x;
			num/=10;
	}
	System.out.println("Reverse number: "+rev);
}
}