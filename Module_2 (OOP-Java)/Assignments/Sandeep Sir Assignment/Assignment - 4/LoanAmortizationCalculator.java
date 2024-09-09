import java.util.Scanner;
class LoanAmortizationCalculator {

    // Private fields for principal, annual interest rate, and loan term
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    // Getter and setter methods for principal
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;

    // Getter and setter methods for annual interest rate
    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter and setter methods for loan term (in years)
    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    // Method to accept user input
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        setPrincipal(scanner.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        setAnnualInterestRate(scanner.nextDouble());

        System.out.print("Enter the loan term (in years): ");
        setLoanTerm(scanner.nextInt());

        scanner.close();
    }

    // Method to calculate monthly payment
    public double calculateMonthlyPayment() {
        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;

        // Calculate the number of months for the loan
        int numberOfMonths = getLoanTerm() * 12;

        // Apply the mortgage formula to calculate monthly payment
        double monthlyPayment = getPrincipal() * 
            (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
            (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

    // Method to print the monthly payment and total payment over the loan period
    public void printRecord(double monthlyPayment) {
        int numberOfMonths = getLoanTerm() * 12;
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: "+monthlyPayment);
        System.out.printf("Total Amount Paid Over the Life of the Loan: "+totalPayment);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of LoanAmortizationCalculator
        LoanAmortizationCalculator loanCalculator = new LoanAmortizationCalculator();

        // Accept user inputs for principal, interest rate, and loan term
        loanCalculator.acceptRecord();

        // Calculate monthly payment
        double monthlyPayment = loanCalculator.calculateMonthlyPayment();

        // Display monthly payment and total payment
        loanCalculator.printRecord(monthlyPayment);
    }
}
