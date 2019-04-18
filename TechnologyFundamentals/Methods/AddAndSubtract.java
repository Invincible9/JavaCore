package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddAndSubtract {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        int sum = sumTwoNumbers(firstNumber, secondNumber);
        System.out.println(subtract(sum, thirdNumber));

    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }

    public static int subtract(int sum, int number) {
        return sum - number;
    }
}
