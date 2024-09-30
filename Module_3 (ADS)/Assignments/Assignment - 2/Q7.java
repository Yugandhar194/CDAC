//Reverse a number
import java.util.*;
class Q7 {
	public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any number: ");
	String str = sc.nextLine();
	String rev_str = "";
	for (int i = str.length()-1; i >= 0; i--) {
	 rev_str += str.charAt(i);
	}
	System.out.println("Reversed number is: "+rev_str);
}
}
//Time Complexity: O(n)
//Space Complexity: O(1)