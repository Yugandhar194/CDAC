public class Q20 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
                if (j > n - i + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}