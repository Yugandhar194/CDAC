public class Q5 //Calculate GCD
{
    public static int euclideanGCD(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;				//swapping but b % b
            b = temp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 54;		// input constraints
        int num2 = 24;
		
		int num3 = 13;
		int num4 = 17;
        int gcd = euclideanGCD(num1, num2);
		int gcd = euclideanGCD(num3, num4);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
		System.out.println("GCD of " + num3 + " and " + num4 + " is: " + gcd);
    }
}
// Time Complexity  O(n)
// Space Complexity O(1)