package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RageExpenses_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        int lostGamesCount = Integer.parseInt(reader.readLine());
        double headsetPrice = Double.parseDouble(reader.readLine());
        double mousePrice = Double.parseDouble(reader.readLine());
        double keyboardPrice = Double.parseDouble(reader.readLine());
        double displayPrice = Double.parseDouble(reader.readLine());

        double expenses =
                (lostGamesCount / 2) * headsetPrice +
                        (lostGamesCount / 3) * mousePrice +
                        (lostGamesCount / 6) * keyboardPrice +
                        (lostGamesCount / 12) * displayPrice;

        System.out.println(String.format("Rage expenses: %.2f lv.", expenses));
    }
}
