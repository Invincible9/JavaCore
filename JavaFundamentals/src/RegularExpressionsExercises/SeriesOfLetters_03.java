package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 4/22/2017.
 */
public class SeriesOfLetters_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        System.out.println(info.replaceAll("(.+?)(\\1+)", "$1"));

    }
}
