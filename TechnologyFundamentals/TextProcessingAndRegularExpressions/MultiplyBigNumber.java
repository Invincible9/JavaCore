package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String number = reader.readLine();
        int multiplier = Integer.parseInt(reader.readLine());

        if (multiplier == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder result = new StringBuilder();
        int remainder = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(number.charAt(i) + "");
            int currentSum = multiplier * digit + remainder;

            remainder = currentSum / 10;
            result.append(currentSum % 10);
        }

        if(remainder != 0) {
            result.append(remainder);
        }

        System.out.println(result.reverse());
    }

}
