package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String str = reader.readLine();
        StringBuilder sb = new StringBuilder();
        int skipCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (skipCounter > 0) {
                if (str.charAt(i) == '>') {
                    skipCounter += Integer.parseInt(str.charAt(i + 1) + "");
                    sb.append(">");
                } else {
                    skipCounter--;
                }
            } else {
                if (str.charAt(i) == '>') {
                    skipCounter += Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                }
                sb.append(str.charAt(i));
            }
        }


        System.out.println(sb);
    }
}
