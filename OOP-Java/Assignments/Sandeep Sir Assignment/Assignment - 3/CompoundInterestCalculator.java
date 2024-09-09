//2-Compound
import java.util.Scanner;

public class CompoundInterestCalculator {
    double principal, annualInterestRate, numberOfCompounds, years;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        numberOfCompounds = scanner.nextDouble();
        System.out.print("Enter investment duration (in years): ");
        years = scanner.nextDouble();
    }

    public double calculateFutureValue() {
        return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds / 100),
                numberOfCompounds * years);
    }

    public void printRecord() {
        double futureValue = calculateFutureValue();
        double totalInterest = futureValue - principal;
        System.out.printf("Future Value: "+futureValue);
        System.out.printf("Total Interest Earned: "+totalInterest);
    }

    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}
