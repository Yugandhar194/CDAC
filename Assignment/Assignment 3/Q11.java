public class Q11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Using pre-increment and post-decrement in a single expression
        int result = ++a + b--;  // result = (pre-incremented a) + (b before post-decrement)

        // Output the values of a, b, and result
        System.out.println("Value of a after pre-increment: " + a);
        System.out.println("Value of b after post-decrement: " + b);
        System.out.println("Result of the expression (++a + b--): " + result);
    }
}
