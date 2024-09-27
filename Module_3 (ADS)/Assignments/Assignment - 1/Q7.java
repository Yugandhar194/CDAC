import java.util.Scanner;
public class Q7 {	//show repeat characters (only lowercase)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] charCount = new int[26]; // Assuming only lowercase letters

        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i) - 'a']++;
        }

        System.out.print("Repeated characters: ");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.print((char) ('a' + i) + ", ");
            }
        }
    }
}