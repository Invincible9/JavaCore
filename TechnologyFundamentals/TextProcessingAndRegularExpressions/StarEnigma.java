package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> attackers = new ArrayList<>();
        List<String> destroyers = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());

        Pattern pattern = Pattern.compile("[star]",
                Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();

            Matcher matcher = pattern.matcher(input);

            int count = 0;

            while (matcher.find()) {
                count++;
            }

            StringBuilder encode = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                encode.append(Character.toChars(input.charAt(j) - count));
            }

            Pattern pattern1 = Pattern.compile("" +
                    "@([A-Za-z]+)(?:[^@\\-!:]*):" +
                    "(\\d+)(?:[^@\\-!:]*)!([AD])" +
                    "!(?:[^@\\-!:]*)->(\\d+)");

            Matcher matcher1 = pattern1.matcher(encode.toString());

            if (matcher1.find()) {
                if (matcher1.group(3).equals("A")) {
                    attackers.add(matcher1.group(1));
                } else if (matcher1.group(3).equals("D")) {
                    destroyers.add(matcher1.group(1));
                }
            }
        }

        System.out.printf("Attacked planets: %d\n", attackers.size());
        attackers.stream().sorted(String::compareTo)
                .forEach(a -> System.out.println(String.format("-> %s", a)));
        System.out.printf("Destroyed planets: %d\n", destroyers.size());
        destroyers.stream().sorted(String::compareTo)
                .forEach(d -> System.out.println(String.format("-> %s", d)));
    }
}
