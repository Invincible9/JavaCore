package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] words = Arrays.stream(reader.readLine().split("\\s+"))
                .toArray(String[]::new);

        String firstWord = words[0];
        String secondWord = words[1];

        long sum = multiplyCharacters(firstWord, secondWord);
        System.out.println(sum);
    }

    private static long multiplyCharacters(String firstWord, String secondWord) {
        long sum = 0;

       int minLength = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < minLength; i++) {
            sum += (firstWord.charAt(i) * secondWord.charAt(i));
        }

        String longestWord = firstWord.length() < secondWord.length() ? secondWord : firstWord;

        for (int i = minLength; i < longestWord.length(); i++) {
            sum += longestWord.charAt(i);
        }

        return sum;
    }

}
