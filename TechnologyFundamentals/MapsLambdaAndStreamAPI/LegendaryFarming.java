package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        LinkedHashMap<String, Integer> junks = new LinkedHashMap<>();

        boolean flag = false;

        while (true) {
            String[] elements = reader.readLine().split("\\s+");

            for (int i = 0; i < elements.length; i += 2) {
                int quantity = Integer.parseInt(elements[i]);
                String material = elements[i + 1].toLowerCase();

                if (!keyMaterials.containsKey(material)) {
                    if (!junks.containsKey(material)) {
                        junks.put(material, quantity);
                    } else {
                        junks.put(material, junks.get(material) + quantity);
                    }
                } else {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        System.out.println(String.format("%s obtained!", material));
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                break;
            }
        }

        keyMaterials.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }

                    return sort;
                }).forEach(v -> {
            System.out.println(String.format("%s: %d", v.getKey(), v.getValue()));
        });

        junks.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
                });
    }
}
