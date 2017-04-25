package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class MatchPhoneNumber_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^\\+359( |-)2(\\1)\\d{3}(\\1)\\d{4}$");

        String info = reader.readLine();

        while (!info.equals("end")) {

            Matcher matcher = pattern.matcher(info);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }

            info = reader.readLine();
        }

    }
}
