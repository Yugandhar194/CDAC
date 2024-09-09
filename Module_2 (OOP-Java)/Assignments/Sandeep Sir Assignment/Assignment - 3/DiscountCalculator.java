//4-Discount
import java.util.Scanner;

public class DiscountCalculator {
    double originalPrice, discountRate;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price of the item: ");
        originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();
    }

    public double calculateDiscount() {
        return originalPrice * (discountRate / 100);
    }

    public void printRecord() {
        double discountAmount = calculateDiscount();
        double finalPrice = originalPrice - discountAmount;
        System.out.printf("Discount Amount: "+discountAmount);
        System.out.println("Final Price: "+finalPrice);
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}
