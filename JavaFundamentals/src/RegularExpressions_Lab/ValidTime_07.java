package RegularExpressions_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/22/2017.
 */
public class ValidTime_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2}) (?:[AP]M)$");

        String info = reader.readLine();

        while (!info.equals("END")) {

            Matcher matcher = pattern.matcher(info);

            if (matcher.find()) {
                int hour = Integer.parseInt(matcher.group(1));
                int minutes = Integer.parseInt(matcher.group(2));
                int seconds = Integer.parseInt(matcher.group(3));

                if (isValid(hour, minutes, seconds)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            } else {
                System.out.println("invalid");
            }

            info = reader.readLine();
        }

    }

    private static boolean isValid(int hour, int minutes, int seconds) {
        if (!(hour >= 1 && hour < 13)) {
            return false;
        }

        if (!(minutes >= 0 && minutes < 60)) {
            return false;
        }

        if (!(seconds >= 0 && seconds < 60)) {
            return false;
        }

        return true;
    }
}
