import java.util.*;

class Main {
    public static String RepeatingCharacters(String str) {
        StringBuilder result = new StringBuilder();
        char prevChar = '\0'; // Initial previous character
        int count = 1; // Count occurrences of a character

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If current character matches the previous one, increase the count
            if (currentChar == prevChar) {
                count++;
            } else {
                // If it's a different character, append the previous character to the result
                if (count > 1) {
                    result.append('_');
                }
                result.append(prevChar);
                prevChar = currentChar; // Update the previous character
                count = 1; // Reset count
            }
        }

        // Append the last character (if it was repeating, add the underscore)
        if (count > 1) {
            result.append('_');
        }
        result.append(prevChar);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(RepeatingCharacters(s.nextLine()));
    }
}