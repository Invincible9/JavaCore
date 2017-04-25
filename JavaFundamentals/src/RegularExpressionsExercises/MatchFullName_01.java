package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class MatchFullName_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^([A-Z][a-z]+) ([A-Z][a-z]+)$");

        String info = reader.readLine();

        while (!info.equals("end")) {

            Matcher matcher = pattern.matcher(info);

            while (matcher.find()) {
                System.out.println(matcher.group(0));
            }

            info = reader.readLine();
        }

    }
}
