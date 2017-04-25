package SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Mihail on 4/6/2017.
 */
public class CountSameValuesinArray_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> countNumbers = new HashMap<>();

        String[] numbers = reader.readLine().split("\\s+");

        int counter = 1;
        for (String number : numbers) {
            if (!countNumbers.containsKey(number)) {
                countNumbers.put(number, counter);
            } else {
                countNumbers.put(number, countNumbers.get(number) + 1);
            }
        }

        for (String key : countNumbers.keySet()) {
            System.out.printf("%s - %d times\n", key, countNumbers.get(key));
        }

    }
}
