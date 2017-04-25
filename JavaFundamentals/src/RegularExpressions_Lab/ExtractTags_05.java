package RegularExpressions_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class ExtractTags_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("<.+?>");

        String info = reader.readLine();

        while (!info.equals("END")) {
            Matcher matcher = pattern.matcher(info);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

            info = reader.readLine();
        }

    }
}
