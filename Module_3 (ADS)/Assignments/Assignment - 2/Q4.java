//Reverse a String
import java.util.*;
class Q4 {
	public static void main (String args[]) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner (System.in);
		String s1 = sc.next();
        StringBuilder s2 = new StringBuilder();

        // append() string value of its argument to the StringBuilde
        s2.append(s1);

        // reverse StringBuilder s2
        s2.reverse();

        // print reversed String
        System.out.println(s2);
	}
}
//Time Complexity: O(n)
//Space Complexity: O(n)