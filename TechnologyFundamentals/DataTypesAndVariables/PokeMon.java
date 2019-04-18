package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokeMon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int Y = Integer.parseInt(reader.readLine());

        int percent = (N * 50) / 100;
        int countOfTargets = 0;

        while (N >= M) {
            N -= M;
            countOfTargets++;

            if (N == percent) {
                if (Y > 0) {
                    N /= Y;
                }
            }
        }

        System.out.println(N);
        System.out.println(countOfTargets);

    }
}
