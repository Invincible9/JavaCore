package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] words = Arrays.stream(reader.readLine().split(", "))
                .toArray(String[]::new);

        for (String word : words) {
            if (validateLength(word) && containsValidSymbols(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean containsValidSymbols(String word) {
        String validSymbols = "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_";

        for (int i = 0; i < word.length(); i++) {
            if (validSymbols.indexOf(word.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }

    private static boolean validateLength(String word) {
        return word.length() >= 3 && word.length() <= 16;
    }


}
