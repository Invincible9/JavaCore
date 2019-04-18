package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        long number = Long.parseLong(reader.readLine());

        long sum = 0;
        while (number > 0) {
            sum += number % 10;

            number /= 10;
        }

        System.out.println(sum);

    }
}
