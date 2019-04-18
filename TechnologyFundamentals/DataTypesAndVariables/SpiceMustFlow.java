package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        int startingYield = Integer.parseInt(reader.readLine());
        int mineOperated = 0;
        int total = 0;

//        if (startingYield < 100) {
//            System.out.println("0\n0");
//            return;
//        }

        while (startingYield >= 100) {
            mineOperated++;
            total += startingYield - 26;
            startingYield -= 10;
        }


        System.out.println(mineOperated);
        System.out.println(total - 26);
    }
}
