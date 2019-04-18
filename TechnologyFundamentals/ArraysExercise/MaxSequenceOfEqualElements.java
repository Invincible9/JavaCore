package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] input = reader.readLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int index = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    count++;
                    if(count > maxCount){
                        maxCount = count;
                        index = i;
                    }
                }else {
                    break;
                }
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(numbers[i + index] + " ");
        }

        System.out.println();
    }
}
