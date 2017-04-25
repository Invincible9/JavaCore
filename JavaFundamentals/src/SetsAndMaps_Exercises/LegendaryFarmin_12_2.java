package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 4/11/2017.
 */
public class LegendaryFarmin_12_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        TreeMap<String, Long> materials = new TreeMap<>();
        TreeMap<String, Long> junk = new TreeMap<>();

        materials.put("shards", 0l);
        materials.put("fragments", 0l);
        materials.put("motes", 0l);

        HashMap<String, String> legendaries = new HashMap<>();

        legendaries.put("shards", "Shadowmourne");
        legendaries.put("fragments", "Valanyr");
        legendaries.put("motes", "Dragonwrath");


        String searchingItem = "";
        while (info != null && !info.isEmpty()) {
            String[] items = info.toLowerCase().split(" ");
            boolean flag = false;

            for (int i = 0; i < items.length; i += 2) {
                long quantity = Long.parseLong(items[i]);
                String material = items[i + 1];

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    if (!materials.containsKey(material)) {
                        materials.put(material, 0l);
                    } else {
                        materials.put(material, materials.get(material) + quantity);
                    }

                    if (materials.get(material) >= 250) {
                        searchingItem = material;
                        flag = true;
                        materials.put(material, materials.get(material) - 250);
                        break;
                    }

                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        junk.put(material, junk.get(material) + quantity);
                    }
                }
            }

            if (flag) {
                break;
            }

            info = reader.readLine();
        }

        if (materials.containsKey(searchingItem)) {
            System.out.println(legendaries.get(searchingItem) + " obtained!");
        }

        materials.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

        junk.entrySet().stream()
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

    }
}
