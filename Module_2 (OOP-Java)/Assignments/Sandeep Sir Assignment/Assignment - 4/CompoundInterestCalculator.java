import java.util.Scanner;

public class CompoundInterestCalculator {

    // Private fields for principal, interest rate, compounds per year, and duration
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;

    // Getter and setter for principal
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    // Getter and setter for annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter and setter for number of times the interest is compounded per year
    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    // Getter and setter for investment duration in years
    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount : ");
        setPrincipal(scanner.nextDouble());

        System.out.print("Enter the annual interest rate : ");
        setAnnualInterestRate(scanner.nextDouble());

        System.out.print("Enter amount compounded: ");
        setNumberOfCompounds(scanner.nextInt());  
        System.out.print("Enter the investment duration (in years): ");
        setYears(scanner.nextInt());

        scanner.close();
    }

    // Method to calculate the future value of the investment
    public double calculateFutureValue() {
        // Convert the annual interest rate to a decimal
        double rateAsDecimal = getAnnualInterestRate() / 100;

        // Apply the compound interest formula to calculate future value
        double futureValue = getPrincipal() * 
            Math.pow((1 + rateAsDecimal / getNumberOfCompounds()), 
            getNumberOfCompounds() * getYears());

        return futureValue;
    }

    // Method to print the future value and total interest earned
    public void printRecord(double futureValue) {
        // Calculate total interest earned
        double totalInterest = futureValue - getPrincipal();

        System.out.printf("Future Value: ", +futureValue);
        System.out.printf("Total Interest Earned: "  +totalInterest);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of CompoundInterestCalculator
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

        // Accept user inputs
        calculator.acceptRecord();

        // Calculate the future value
        double futureValue = calculator.calculateFutureValue();

        // Display future value and total interest earned
        calculator.printRecord(futureValue);
    }
}
