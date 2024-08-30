import java.util.*;

class TS {
    public static String ToggleStrings(String str) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c); // If it's not a letter, just append it as is.
            }
        }

        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(ToggleStrings(s.nextLine()));
    }
}