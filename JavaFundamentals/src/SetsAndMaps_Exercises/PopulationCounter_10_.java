package SetsAndMaps_Exercises;

import java.io.IOException;
import java.util.*;

/**
 * Created by Mihail on 4/7/2017.
 */
public class PopulationCounter_10_ {
    public static void main(String[] args) throws IOException {

        Scanner console = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();
        LinkedHashMap<String, Long> totalPopulation = new LinkedHashMap<>();

        while (true) {
            String[] input = console.nextLine().split("\\|");
            if (input[0].equals("report")) {
                break;
            }
            String country = input[1];
            String city = input[0];
            long population = Long.parseLong(input[2]);

            if (!map.containsKey(country)) {
                map.put(country, new LinkedHashMap<>());
                totalPopulation.put(country, population);
            } else {
                totalPopulation.put(country, totalPopulation.get(country) + population);
            }

            if (!map.get(country).containsKey(city)) {
                map.get(country).put(city, population);
            } else {
                map.get(country).put(city, map.get(country).get(city) + population);
            }

        }

        List<String> countries = new LinkedList<>();
        totalPopulation.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(c -> countries.add(c.getKey()));

        for (String country : countries) {
            System.out.printf("%s (total population: %d)\n", country, totalPopulation.get(country));
            LinkedHashMap<String, Long> cities = map.get(country);
            cities.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(c -> System.out.printf("=>%s: %d\n", c.getKey(), c.getValue()));
        }
    }
}


//        Scanner sc = new Scanner(System.in);
//        String input = "";
//        LinkedHashMap<String , LinkedHashMap<String, Long>> countriesAndCities = new LinkedHashMap<>();
//        LinkedHashMap<String, Long> countriesOnly = new LinkedHashMap<>();
//
//        while(!(input = sc.nextLine()).equals("report")){
//            String [] data = input.split("\\|");
//            String city = data[0];
//            String country = data[1];
//            Long population = Long.parseLong(data[2]);
//
//            if(!countriesAndCities.containsKey(country)){
//                countriesAndCities.put(country,new LinkedHashMap<>());
//                countriesOnly.put(country, 0L);
//            }
//            countriesOnly.put(country,countriesOnly.get(country)+population);
//            if(!countriesAndCities.get(country).containsKey(city)){
//                countriesAndCities.get(country).put(city,population);
//            }
//        }
//
//        countriesAndCities.entrySet().stream()
//                .sorted((c1,c2)-> countriesOnly.get(c2.getKey()).compareTo(countriesOnly.get(c1.getKey())))
//                .forEach(country ->{
//                    System.out.format("%s (total population: %d)\n",country.getKey(),countriesOnly.get(country.getKey()));
//                    country.getValue().entrySet()
//                            .stream().sorted((t1,t2)-> t2.getValue().compareTo(t1.getValue())).forEach(city ->{
//                        System.out.format("=>%s: %d\n", city.getKey(),city.getValue());
//                    });
//                });


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String info = reader.readLine();
//
//        LinkedHashMap<String, LinkedHashMap<String, Long>> countPopulation = new LinkedHashMap<>();
//
//        while (!info.equals("report")) {
//            String[] infoSplit = info.split("\\|");
//
//            String city = infoSplit[0];
//            String country = infoSplit[1];
//            Long population = Long.parseLong(infoSplit[2]);
//
//            if (!countPopulation.containsKey(country)) {
//                LinkedHashMap<String, Long> cityPopulation = new LinkedHashMap<>();
//                countPopulation.put(country, cityPopulation);
//            }
//
//            if (!countPopulation.get(country).containsKey(city)) {
//                countPopulation.get(country).put(city, population);
//            } else {
//                countPopulation.get(country).replace(city, countPopulation.get(country).get(city) + population);
//            }
//
//            info = reader.readLine();
//        }
//

//        LinkedHashMap<String, Long> result = new LinkedHashMap<>();
//
//        for (String s : countPopulation.keySet()) {
//            LinkedHashMap<String, Long> sorted = countPopulation.get(s).entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
//                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//            Long totalPopulation = 0l;
//            String towns = "";
//            for (String s1 : sorted.keySet()) {
//                Long townPop = countPopulation.get(s).get(s1);
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


//        Scanner scan = new Scanner(System.in);
//
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
//
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

//    }
//}