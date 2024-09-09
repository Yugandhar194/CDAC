public class WideningConversionAdvanced {
    public static void main(String[] args) {
        int num = 42;

        // Widening conversion to double
        double doubleResult = num;

        // Widening conversion to float
        float floatResult = num;

        // Conversion to Boolean (boolean doesn't support widening from int directly, so we use a condition)
        boolean booleanResult = (num != 0);  // Any non-zero integer is treated as true, 0 as false

        // Conversion to String
        String stringResult = Integer.toString(num);

        System.out.println("Widening conversion from int to double: " + doubleResult);
        System.out.println("Widening conversion from int to float: " + floatResult);
        System.out.println("Conversion from int to boolean: " + booleanResult);
        System.out.println("Conversion from int to string: " + stringResult);
    }
}