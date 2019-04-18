package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] numbers = reader.readLine().split("\\s+");
        int rotations = Integer.parseInt(reader.readLine());


        for (int i = 0; i < rotations % numbers.length; i++) {
            String firstElement = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }

            numbers[numbers.length - 1] = firstElement;
        }

        System.out.println(String.join(" ", numbers));
    }
}
