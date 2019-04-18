package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<String> numbers =
                Arrays.stream(reader.readLine().split("\\s+"))
                        .collect(Collectors.toList());

        String input = "";

        while (!"End".equals(input = reader.readLine())) {

            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Add":
                    numbers.add(data[1]);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);

                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, data[1]);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(data[1]);
                    if (removeIndex >= 0 && removeIndex < numbers.size()) {
                        numbers.remove(removeIndex);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (data[1].equals("left")) {
                        if (numbers.size() > 0) {
                            for (int i = 0; i < Integer.parseInt(data[2]) % numbers.size(); i++) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            }
                        }
                    } else {
                        if (numbers.size() > 0) {
                            for (int i = 0; i < Integer.parseInt(data[2]) % numbers.size(); i++) {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                        }
                    }
                    break;
            }
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
