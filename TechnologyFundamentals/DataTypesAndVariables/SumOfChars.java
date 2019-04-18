package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfChars {

    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        long sum = 0;
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            sum += reader.readLine().charAt(0);
        }

        System.out.println(String.format(
                "The sum equals: %d", sum
        ));
    }


}
