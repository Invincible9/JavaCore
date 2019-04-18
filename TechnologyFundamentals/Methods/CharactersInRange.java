package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharactersInRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        char first = reader.readLine().charAt(0);
        char second = reader.readLine().charAt(0);
        int start = Math.min(first, second);
        int end = Math.max(first, second);

        printCharactersInRange(start, end);
    }

    public static void printCharactersInRange(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
