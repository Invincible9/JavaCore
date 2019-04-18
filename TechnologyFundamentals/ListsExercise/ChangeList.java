package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> numbers =
                Arrays.stream(reader.readLine()
                        .split("\\s+"))
                        .collect(Collectors.toList());

        String input = "";

        while (!"end".equals(input = reader.readLine())) {

            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Delete":
                    numbers =
                            numbers
                                    .stream()
                                    .filter(e -> !e.equals(data[1]))
                                    .collect(Collectors.toList());
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, data[1]);
                    }
                    break;
            }
        }

        System.out.println(
                numbers
                        .toString()
                        .replaceAll("[\\[\\],]", ""));

    }
}
