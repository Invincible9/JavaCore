package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerOperations {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        long firstNumber = Long.parseLong(reader.readLine());
        long secondNumber = Long.parseLong(reader.readLine());
        long thirdNumber = Long.parseLong(reader.readLine());
        long fourthNumber = Long.parseLong(reader.readLine());

        long sum = firstNumber + secondNumber;
        long divide = sum / thirdNumber;
        long multiply = divide * fourthNumber;

        System.out.println(multiply);
    }
}
