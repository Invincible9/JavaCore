package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * Created by Mihail on 4/6/2017.
 */
public class UniqueUsernames_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        uniqueNames.stream().forEach(System.out::println);
    }
}
