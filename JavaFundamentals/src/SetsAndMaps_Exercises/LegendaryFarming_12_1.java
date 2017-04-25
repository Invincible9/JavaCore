package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Mihail on 4/11/2017.
 */
public class LegendaryFarming_12_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        TreeMap<String, Long> specialMaterials = new TreeMap<>();
        TreeMap<String, Long> junkMaterials = new TreeMap<>();

        specialMaterials.put("shards", 0l);
        specialMaterials.put("fragments", 0l);
        specialMaterials.put("motes", 0l);

        LinkedHashMap<String, String> legendaries = new LinkedHashMap<>();

        legendaries.put("shards", "Shadowmourne");
        legendaries.put("fragments", "Valanyr");
        legendaries.put("motes", "Dragonwrath");

        String item = "";
        while (!info.isEmpty()) {
            String[] items = info.toLowerCase().split("\\s+");

            for (int i = 0; i < items.length; i += 2) {
                long quantity = Long.parseLong(items[i]);
                String material = items[i + 1];

                if (specialMaterials.containsKey(material)) {
                    specialMaterials.put(material, specialMaterials.get(material) + quantity);
                } else  if (!specialMaterials.containsKey(material)) {
                    specialMaterials.put(material, quantity);
                }else  {
                    if (!junkMaterials.containsKey(material)) {
                        junkMaterials.put(material, quantity);
                    } else {
                        junkMaterials.put(material, junkMaterials.get(material) + quantity);
                    }
                }

                if (specialMaterials.get(material) != null) {
                    if (specialMaterials.get(material) >= 250) {
                        item = material;
                        specialMaterials.put(material, specialMaterials.get(material) - 250);
                        break;
                    }
                }

            }
            info = reader.readLine();
        }

        if (legendaries.containsKey(item)) {
            System.out.println(legendaries.get(item) + " obtained!");
        }

        specialMaterials.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));

        junkMaterials.entrySet().stream()
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));
    }
}
