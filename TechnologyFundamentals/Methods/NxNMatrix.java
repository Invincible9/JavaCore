package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NxNMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println(newString(n, n));
        }
    }

    public static String newString(int symbol, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(symbol).append(" ");
        }

        return result.toString().trim();
    }
}
