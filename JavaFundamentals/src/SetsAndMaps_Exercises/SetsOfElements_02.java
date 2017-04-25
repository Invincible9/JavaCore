package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Mihail on 4/6/2017.
 */
public class SetsOfElements_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        int[] commands = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < commands[0]; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (!firstSet.contains(number))
                firstSet.add(number);
        }

        for (int i = 0; i < commands[1]; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (!secondSet.contains(number))
                secondSet.add(number);
        }

        Set<Integer> result = setElements(firstSet, secondSet);

        int counter = 0;
        for (Integer integer : result) {
            if (counter != result.size() - 1) {
                System.out.print(integer + " ");
            } else {
                System.out.print(integer);
            }
            counter++;
        }
    }

    public static LinkedHashSet<Integer> setElements(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new LinkedHashSet<>();

        for (Integer el : first) {
            if (second.contains(el)) {
                if (!result.contains(el)) {
                    result.add(el);
                }
            }
        }

        return (LinkedHashSet<Integer>) result;
    }
}
