import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i, n, fact = 1;
		System.out.println("Enter any number whose factorial you want: ");
        n = sc.nextInt();
        
        for(i = 1; i <= n; i++) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
