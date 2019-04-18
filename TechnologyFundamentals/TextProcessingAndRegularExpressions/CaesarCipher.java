package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String text = reader.readLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append(Character.toChars(text.charAt(i) + 3));
        }

        System.out.println(result);
    }
}
