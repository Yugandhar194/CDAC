public class Q17 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the reverse pyramid

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}