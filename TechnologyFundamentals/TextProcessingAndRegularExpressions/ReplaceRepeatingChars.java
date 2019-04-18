package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceRepeatingChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String text = reader.readLine();
        char prev = text.charAt(0);
        String result = "";
        result += prev;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if(current != prev){
                prev = current;
                result += prev;
            }
        }

        System.out.println(result);
    }
}
