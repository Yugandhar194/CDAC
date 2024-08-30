import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
		
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
		
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;

            default:
                System.out.println("Error, Invalid operator.");
                sc.close();
                return;
        }

        
        System.out.println("The result is: " + result);

        sc.close();
    }
}
