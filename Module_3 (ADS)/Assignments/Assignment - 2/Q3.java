import java.util.Scanner;
public class Q3 { //RemoveWhitespace 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isWhitespace(c)) {
                output += c;
            }
        }
        System.out.println(output);
    }
}