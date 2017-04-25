package SetsAndMaps_Exercises;

import java.util.Scanner;
import java.util.TreeMap;


/**
 * Created by Mihail on 4/10/2017.
 */
public class LegendaryFarming_12 {
    public static void main(String[] args) {

        Scanner console =  new Scanner(System.in);
        TreeMap<String, Integer> materials = new TreeMap<>();
        TreeMap<String, Integer> junk = new TreeMap<>();

        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        while (true){
            String[] input = console.nextLine().toLowerCase().split(" ");
            String item = "";
            for (int i = 0; i < input.length; i +=2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (materials.containsKey(material)){
//                        || material.equals("fragments")
//                        || material.equals("motes")){
//                    if(!materials.containsKey(material)){
//                        materials.put(material, 0);
//                    }
                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250){
                        item = material;
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
            if (!item.isEmpty()){
                switch (item) {
                    case "shards":
                        System.out.println("Shadowmourne obtained!");
                        break;
                    case "fragments":
                        System.out.println("Valanyr obtained!");
                        break;
                    default:
                        System.out.println("Dragonwrath obtained!");
                        break;
                }
                break;
            }

        }

        materials.entrySet().stream()
                .sorted((m1, m2) -> m2.getValue().compareTo(m1.getValue()))
                .forEach(print -> System.out.printf("%s: %d%n", print.getKey(), print.getValue()));
        junk.entrySet()
                .forEach(jPr -> System.out.printf("%s: %d%n", jPr.getKey(), jPr.getValue()));
    }
}