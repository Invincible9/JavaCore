package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAndSum_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        int start = Integer.parseInt(reader.readLine());
        int end = Integer.parseInt(reader.readLine());

        int sum = 0;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.printf("\nSum: %d",sum);
    }
}
