//1-Loan
import java.util.Scanner;

public class LoanAmortizationCalculator {
    double principal, annualInterestRate, loanTerm;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan amount (Principal): ");
        principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter loan term (in years): ");
        loanTerm = scanner.nextDouble();
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = (int) (loanTerm * 12);
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public void printRecord() {
        double monthlyPayment = calculateMonthlyPayment();
        double totalAmount = monthlyPayment * loanTerm * 12;
        System.out.printf("Monthly Payment: " +monthlyPayment);
        System.out.printf("Total Amount Paid: "+totalAmount);
    }

    public static void main(String[] args) {
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();
        calculator.acceptRecord();
        calculator.printRecord();
    }
}
