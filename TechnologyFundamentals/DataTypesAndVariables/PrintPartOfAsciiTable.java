package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) throws IOException {

        BufferedReader reader
                = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        int start = Integer.parseInt(reader.readLine());
        int end = Integer.parseInt(reader.readLine());

        for (int i = start; i <= end; i++) {
            System.out.print((char)i + " ");
        }

    }
}
