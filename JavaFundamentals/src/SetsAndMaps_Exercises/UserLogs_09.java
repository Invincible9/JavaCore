package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by Mihail on 4/7/2017.
 */
public class UserLogs_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        TreeMap<String, LinkedHashMap<String, Integer>> userLogs = new TreeMap<>();

        while (!info.equals("end")) {

            String[] elements = info.split("\\s+");

            int indexName = elements[2].indexOf("=");
            String name = elements[2].substring(indexName + 1);

            int indexIp = elements[0].indexOf("=");
            String ip = elements[0].substring(indexIp + 1);

            if (!userLogs.containsKey(name)) {
                LinkedHashMap<String, Integer> ips = new LinkedHashMap<>();
                userLogs.put(name, ips);
            }

            if (!userLogs.get(name).containsKey(ip)) {
                userLogs.get(name).put(ip, 1);
            } else {
                userLogs.get(name).put(ip, userLogs.get(name).get(ip) + 1);
            }

            info = reader.readLine();
        }

        for (String key : userLogs.keySet()) {
            System.out.println(key + ":");
            String output = "";
            for (String s1 : userLogs.get(key).keySet()) {
                output += s1 + " => " + userLogs.get(key).get(s1) + ", ";
            }
            System.out.println(output.substring(0, output.length() - 2) + ".");
        }

    }
}
