public class Q12 {
    public static void main(String[] args) {
        // Number of rows and columns
        int rows = 5;
        int columns = 5;   
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) 
			{
                System.out.print("*");
            } 
            // Move to the next line after each row
            System.out.println();
        }
    }
}