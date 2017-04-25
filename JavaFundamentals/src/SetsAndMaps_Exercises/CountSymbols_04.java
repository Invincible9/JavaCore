package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * Created by Mihail on 4/6/2017.
 */
public class CountSymbols_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        TreeMap<Character, Long> countChar = new TreeMap<>();

        long counter = 1;
        for (int i = 0; i < text.length(); i++) {
            if (!countChar.containsKey(text.charAt(i))) {
                countChar.put(text.charAt(i), counter);
            } else {
                countChar.put(text.charAt(i), countChar.get(text.charAt(i)) + 1);
            }
        }

        for (Character key : countChar.keySet()) {
            System.out.printf("%s: %d time/s\n", key, countChar.get(key));
        }
    }
}
