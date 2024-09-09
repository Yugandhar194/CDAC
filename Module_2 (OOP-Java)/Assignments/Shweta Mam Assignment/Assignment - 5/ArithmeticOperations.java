public class ArithmeticOperations {
    public static void main(String[] args) {
        int intVal = 10;
        float floatVal = 20.5f;
        double doubleVal = 30.75;

        // Performing arithmetic operations
        double result1 = intVal + floatVal;   // int and float: float is widened to double
        double result2 = floatVal + doubleVal; // float and double: float is widened to double
        double result3 = intVal + doubleVal;   // int and double: int is widened to double

        System.out.println("Result of int + float: " + result1);
        System.out.println("Result of float + double: " + result2);
        System.out.println("Result of int + double: " + result3);
    }
}