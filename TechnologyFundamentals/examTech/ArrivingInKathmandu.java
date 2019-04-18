package examTech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        Pattern pattern = Pattern.compile("" +
                "^(?<peekName>[A-Za-z0-9!@#$?]+)" +
                "=(?<length>\\d+)" +
                "<<(?<code>.+)$");

        String input = "";

        while (!"Last note".equals(input = reader.readLine())) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                int lengthGeoHashCode = Integer.parseInt(matcher.group("length"));
                int lengthCode = matcher.group("code")
                        .toCharArray().length;

                if (lengthGeoHashCode == lengthCode) {

                    Pattern patternNamePeak = Pattern.compile("[^!@#$?]");
                    Matcher matcherNamePeak = patternNamePeak.matcher(matcher.group("peekName"));

                    StringBuilder peekName = new StringBuilder();
                    while (matcherNamePeak.find()) {
                        peekName.append(matcherNamePeak.group());
                    }

                    System.out.println(
                            String.format("Coordinates found! %s -> %s",
                                    peekName, matcher.group("code"))
                    );

                    break;
                }else{
                    System.out.println("Nothing found!");
                }
            }

        }
    }
}
