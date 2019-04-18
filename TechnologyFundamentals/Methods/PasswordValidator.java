package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordValidator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String word = reader.readLine();

        if (!isInRange(word)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isContainsLettersAndDigits(word)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isContainTwoDigit(word)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isInRange(word) && isContainsLettersAndDigits(word) && isContainTwoDigit(word)) {
            System.out.println("Password is valid");
        }

    }

    public static boolean isContainTwoDigit(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                count++;
            }
        }

        if (count < 2) {
            return false;
        }

        return true;
    }

    public static boolean isContainsLettersAndDigits(String word) {
        boolean isValid = false;
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            return false;
        }
        return true;
    }

    public static boolean isInRange(String word) {
        if (word.length() >= 6 && word.length() <= 10) {
            return true;
        }
        return false;
    }
}
