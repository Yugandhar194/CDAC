import java.util.Scanner;

public class DiscountCalculator {

    // Private fields for original price and discount rate
    private double originalPrice;
    private double discountRate;

    // Getter and Setter methods for originalPrice
    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    // Getter and Setter methods for discountRate
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item: ");
        setOriginalPrice(scanner.nextDouble());

        System.out.print("Enter the discount rate %: ");
        setDiscountRate(scanner.nextDouble());

        scanner.close();
    }

    // Method to calculate the discount amount
    public double calculateDiscountAmount() {
        return getOriginalPrice() * (getDiscountRate() / 100);
    }

    // Method to calculate the final price
    public double calculateFinalPrice() {
        double discountAmount = calculateDiscountAmount();
        return getOriginalPrice() - discountAmount;
    }

    // Method to print the results
    public void printRecord() {
        double discountAmount = calculateDiscountAmount();
        double finalPrice = calculateFinalPrice();

        System.out.printf("Discount Amount: ", discountAmount);
        System.out.printf("Final Price: " +finalPrice);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // Accept user input
        calculator.acceptRecord();

        // Display the discount amount and final price
        calculator.printRecord();
    }
}
