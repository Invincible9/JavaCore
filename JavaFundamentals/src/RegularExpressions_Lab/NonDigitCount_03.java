package RegularExpressions_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class NonDigitCount_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("\\D");

        Matcher matcher = pattern.matcher(reader.readLine());

        long count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.printf("Non-digits: %d", count);
    }
}
