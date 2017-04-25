package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/23/2017.
 */
public class ReplaceATag_04_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        String regex = "<a\\s+href=([^>]+)>([^<]+)<\\/a>";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

        StringBuilder sb = new StringBuilder();
        while (!info.equals("END")) {
            sb.append(info).append("\r\n");

            info = reader.readLine();
        }

        Matcher matcher = pattern.matcher(sb.toString());

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.start() + matcher.group(0).length();
            String replacement = getReplace(matcher);
            sb.replace(startIndex, endIndex, replacement);
            matcher = pattern.matcher(sb.toString());
        }

        System.out.println(sb.toString());
    }

    private static String getReplace(Matcher matcher) {
        return "[URL href=" + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
    }
}
