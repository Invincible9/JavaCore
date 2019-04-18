package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        long firstNumber = calculateFactorial(Integer.parseInt(reader.readLine()));
        long secondNumber = calculateFactorial(Integer.parseInt(reader.readLine()));
        double result = firstNumber / secondNumber;
        System.out.println(
                String.format("%.2f",
                        result));

    }

    public static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
