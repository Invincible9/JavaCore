package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        String[] nums = new String[n * 2];

        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            if (i % 2 == 0) {
                nums[count++] = input[0];
                nums[count++] = input[1];
            }else{
                nums[count++] = input[1];
                nums[count++] = input[0];
            }
        }

        String firstLine = "";
        String secondLine = "";

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                firstLine += nums[i] + " ";
            } else {
                secondLine += nums[i] + " ";
            }
        }

        System.out.println(firstLine.trim());
        System.out.println(secondLine.trim());
    }
}
