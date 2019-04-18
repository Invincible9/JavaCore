package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumber_06 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        String text = reader.readLine();

        long sum = 0;
        for (int i = 0; i < text.length(); i++) {
            int number = Integer.parseInt(String.valueOf(text.charAt(i)));

            int factorial = 1;
            for (int j = 1; j <= number; j++) {
                factorial *= j;
            }

            sum += factorial;
        }

        if (sum == Integer.parseInt(text)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
