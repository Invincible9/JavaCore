package RegularExpressions_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class VowelCount_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("[AEIOUY]");

        Matcher matcher = pattern.matcher(reader.readLine().toUpperCase());

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("Vowels: %d", count);
    }
}
