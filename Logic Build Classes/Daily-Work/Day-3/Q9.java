public class Q9 {
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            if (digit > largestDigit) {
                largestDigit = digit; // Update largestDigit if the current digit is greater
            }
            number /= 10; // Remove the last digit
        }

        System.out.println("The largest digit is: " + largestDigit);
    }
}
