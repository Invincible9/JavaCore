package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 4/7/2017.
 */
public class PopulationCounter_10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        LinkedHashMap<String, Long> cities = new LinkedHashMap<>();
        LinkedHashMap<String, Long> countries = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayDeque<String>> countryCity = new LinkedHashMap<>();

        while (!info.equals("report")) {
            String[] infoSplit = info.split("\\|");

            String city = infoSplit[0];
            String country = infoSplit[1];
            Long population = Long.parseLong(infoSplit[2]);

            if (!cities.containsKey(city)) {
                cities.put(city, population);
            } else {
                cities.replace(city, cities.get(city) + population);
            }

            if (!countries.containsKey(country)) {
                countries.put(country, population);
            } else {
                countries.replace(country, countries.get(country) + population);
            }

            long maxVal = 0;
            if (!countryCity.containsKey(country)) {
                ArrayDeque<String> list = new ArrayDeque<>();
                list.add(city);
                countryCity.put(country, list);
            } else {
                if (population > maxVal) {
                    maxVal = population;
                }
                if (countries.get(country) < maxVal) {
                    countryCity.get(country).push(city);
                } else {
                    countryCity.get(country).addFirst(city);
                }

            }

            info = reader.readLine();
        }

        LinkedHashMap<String, Long> sorted = countries.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String key : sorted.keySet()) {
            System.out.println(key + " (total population: " + countries.get(key) + ")");
            for (String key1 : countryCity.keySet()) {
                if (key.contains(key1)) {
                    for (String s : countryCity.get(key1)) {
                        System.out.println("=>" + s + ": " + cities.get(s));
                    }
                }
            }
        }

    }
}


//        Scanner scan = new Scanner(System.in);
//        LinkedHashMap<String, LinkedHashMap<String, Long>> populationStore = new LinkedHashMap<>();
//
//        while (true) {
//            String input = scan.nextLine();
//            if ("report".equals(input)) {
//                break;
//            }
//
//            String[] tokens = input.split("\\|");
//            String town = tokens[0];
//            String country = tokens[1];
//            Long population = Long.parseLong(tokens[2]);
//            if (populationStore.containsKey(country)) {
//                if (populationStore.get(country).containsKey(town)) {
//                    populationStore.get(country).replace(town, populationStore.get(country).get(town) + population);
//                } else {
//                    populationStore.get(country).put(town, population);
//                }
//            } else {
//                LinkedHashMap<String, Long> townPopulation = new LinkedHashMap<>();
//                townPopulation.put(town, population);
//                populationStore.put(country, townPopulation);
//            }
//        }
//
//        LinkedHashMap<String, Long> result = new LinkedHashMap<>();
//
//        for (String s : populationStore.keySet()) {
//            LinkedHashMap<String, Long> sorted = populationStore.get(s).entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//            Long totalPopulation = 0l;
//            String towns = "";
//            for (String s1 : sorted.keySet()) {
//                Long townPop = populationStore.get(s).get(s1);
//                totalPopulation += townPop;
//                towns += "=>" + s1 + ": " + townPop + "\n";
//            }
//            towns = s + " (total population: " + totalPopulation + ")" + "\n" + towns.substring(0, towns.length() - 1);
//            result.put(towns, totalPopulation);
//        }
//
//        LinkedHashMap<String, Long> sorted = result.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//        for (String s : sorted.keySet()) {
//            System.out.println(s);
//        }