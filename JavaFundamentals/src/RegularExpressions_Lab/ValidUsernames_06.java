package RegularExpressions_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class ValidUsernames_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[\\w-]{3,16}+$");

        String info = reader.readLine();

        while (!info.equals("END")) {
            Matcher matcher = pattern.matcher(info);

            if (matcher.find()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }

            info = reader.readLine();
        }

    }
}
