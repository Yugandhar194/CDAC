class Q18 {
    public static void main(String[] args) {
		//upper part of the diamond
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        // lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}
