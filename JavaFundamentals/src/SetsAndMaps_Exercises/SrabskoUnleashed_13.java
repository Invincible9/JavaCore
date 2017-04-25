package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/11/2017.
 */
public class SrabskoUnleashed_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, LinkedHashMap<String, Long>> concert = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("(\\D+)\\s@(\\D+)\\s(\\d+)\\s(\\d+)");

        String info = reader.readLine();

        while (!info.equals("End")) {

            Matcher matcher = pattern.matcher(info);

            while (matcher.find()) {

                String singer = matcher.group(1);
                String venue = matcher.group(2);
                long money = Long.parseLong(matcher.group(3)) *
                        Long.parseLong(matcher.group(4));

                if (!concert.containsKey(venue)) {
                    concert.put(venue, new LinkedHashMap<>());
                }

                if (!concert.get(venue).containsKey(singer)) {
                    concert.get(venue).put(singer, money);
                } else {
                    concert.get(venue).put(singer, concert.get(venue).get(singer) + money);
                }

            }
            info = reader.readLine();
        }

        for (String s : concert.keySet()) {
            System.out.println(s);
            LinkedHashMap<String, Long> conc = concert.get(s);

            conc.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(e -> System.out.printf("#  %s -> %d\n", e.getKey(), e.getValue()));
        }

    }
}
