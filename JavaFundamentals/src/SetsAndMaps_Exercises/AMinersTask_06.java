package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mihail on 4/6/2017.
 */
public class AMinersTask_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> resourses = new LinkedHashMap<>();

        while (true) {
            String resource = reader.readLine();

            if (resource.equals("stop")) {
                break;
            }
            long quantity = Long.parseLong(reader.readLine());

            if (!resourses.containsKey(resource)) {
                resourses.put(resource, quantity);
            } else {
                resourses.put(resource, resourses.get(resource) + quantity);
            }
        }

        for (String key : resourses.keySet()) {
            System.out.println(key + " -> " + resourses.get(key));
        }

    }
}
