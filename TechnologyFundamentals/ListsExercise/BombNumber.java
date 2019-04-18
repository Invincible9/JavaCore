package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers =
                Arrays.stream(reader.readLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int[] data =
                Arrays.stream(reader.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int bombNumber = data[0];
        int power = data[1];

        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);
            int leftIndex = Math.max(0, index - power);
            int rightIndex = Math.min(index + power, numbers.size() - 1);

            for (int i = rightIndex; i >= leftIndex; i--) {
                numbers.remove(i);
            }
        }

        System.out.println(
                numbers
                        .stream()
                        .mapToInt(Integer::valueOf)
                        .sum());


    }
}
