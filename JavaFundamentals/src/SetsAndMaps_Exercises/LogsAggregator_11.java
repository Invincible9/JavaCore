package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 4/10/2017.
 */
public class LogsAggregator_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        TreeMap<String, Long> logs = new TreeMap<>();
        TreeMap<String, TreeSet<String>> userIps = new TreeMap<>();

        while (n-- > 0) {
            String[] info = reader.readLine().split("\\s+");
            String ip = info[0];
            String name = info[1];
            Long duration = Long.parseLong(info[2]);

            if (!logs.containsKey(name)) {
                logs.put(name, duration);
            } else {
                logs.put(name, logs.get(name) + duration);
            }

            TreeSet<String> ips = userIps.get(name);

            if (ips == null) {
                ips = new TreeSet<>();
            }
            ips.add(ip);
            userIps.put(name, ips);
        }

        for (String s : logs.keySet()) {
            System.out.printf("%s: %d ", s, logs.get(s));
            System.out.printf("[%s]\n", String.join(", ", userIps.get(s)));
        }

    }
}
