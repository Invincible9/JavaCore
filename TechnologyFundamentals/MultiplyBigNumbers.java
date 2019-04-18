import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String number = reader.readLine();
        int multiplier = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();

        int remainder = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(
                    number.charAt(i)
            ));

            int multiplyDigits = digit * multiplier + remainder;

            remainder = multiplyDigits / 10;
            sb.append(multiplyDigits % 10);
        }

        if(remainder != 0) {
            sb.append(remainder);
        }

        System.out.println(sb.reverse());
    }
}
