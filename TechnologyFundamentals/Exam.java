import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] encryptedMessage = reader.readLine().split("\\|");

        String firstPart = "(?<left>[#$%*&])(?<letters>[A-Z]+)\\1";
        String secondPart = "(?<asciiCode>\\d{2}):(?<length>\\d{2})(?:.*?)";

        Pattern firstPattern = Pattern.compile(firstPart);
        Pattern secondPattern = Pattern.compile(secondPart);

        Matcher firstMatch = firstPattern.matcher(encryptedMessage[0]);
        Matcher secondMatch = secondPattern.matcher(encryptedMessage[1]);

        String letters = "";
        if (firstMatch.find()) {
            letters = firstMatch.group("letters");
        }

        LinkedHashMap<String, Integer> words =
                new LinkedHashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            words.put(String.valueOf(letters.charAt(i)), 0);
        }

        if (!letters.equals("")) {

            while (secondMatch.find()) {
                String[] matches = secondMatch.group().split(":");
                String letter = String.valueOf(
                        Character.toChars(
                                Integer.parseInt(matches[0])));
                if (letters.contains(letter)) {
                    words.put(letter, Integer.parseInt(matches[1]));
                }
            }

            words.forEach((key, value) -> {
                Arrays.stream(encryptedMessage[2].split("\\s+"))
                        .forEach(e -> {
                            if (e.length() == value + 1) {
                                if (String.valueOf(e.charAt(0)).equals(key)) {
                                    System.out.println(e);
                                }
                            }
                        });

            });
        }

    }


}

