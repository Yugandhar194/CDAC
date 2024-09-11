import java.util.Scanner;
class LoanAmortizationCalculator {

    // member fields
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    // Getter and setter methods 
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;

   
    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

  
    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

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
      
        double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;        
        int numberOfMonths = getLoanTerm() * 12;
        double monthlyPayment = getPrincipal() * 
        (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
        (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

    // Method to print the monthly payment and total payment
    public void printRecord(double monthlyPayment) {
        int numberOfMonths = getLoanTerm() * 12;
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: "+monthlyPayment);
        System.out.printf("Total Amount Paid Over the Life of the Loan: "+totalPayment);
    }

    // Main method
    public static void main(String[] args) {
        LoanAmortizationCalculator loanCalculator = new LoanAmortizationCalculator();

        
        loanCalculator.acceptRecord();

        double monthlyPayment = loanCalculator.calculateMonthlyPayment();
        loanCalculator.printRecord(monthlyPayment);
    }
}
