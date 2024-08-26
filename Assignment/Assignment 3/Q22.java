class Q22 {
    public static void main(String[] args) {
        int rows = 5;
        // Print the top part 
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print the bottom part
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}