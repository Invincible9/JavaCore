package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterOverflow {

    private static final int TANK_CAPACITY = 255;

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        long sum = 0;

        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(reader.readLine());

            if (sum + quantity > TANK_CAPACITY) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += quantity;
            }
        }
        System.out.println(sum);


    }
}
