import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 4/8/2017.
 */

public class MapDistricts_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] cities = reader.readLine().split("\\s+");
        int limit = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, List<Long>> cityPopulation = new LinkedHashMap<>();

        for (String info : cities) {
            String city = info.split(":")[0];
            long population = Integer.parseInt(info.split(":")[1]);

            cityPopulation.putIfAbsent(city, new ArrayList<>());
            cityPopulation.get(city).add(population);
        }

        cityPopulation.entrySet().stream().filter(e -> e.getValue().stream().mapToLong(Long::valueOf).sum() > limit)
                .sorted((e1, e2) -> Long.compare(
                        e2.getValue().stream().mapToLong(Long::valueOf).sum(),
                        e1.getValue().stream().mapToLong(Long::valueOf).sum()
                ))
                .forEach(e -> {
                    System.out.printf("%s: ", e.getKey());
                    e.getValue().stream()
                            .sorted((e1, e2) -> Long.compare(e2, e1))
                            .limit(5)
                            .forEach(e1 -> System.out.print(e1 + " "));
                    System.out.println();
                });


//        cityPopulation.entrySet().stream().filter(c -> c.getValue().stream().mapToLong(Long::valueOf).sum() > number)
//                .sorted((e1, e2) -> Long.compare(
//                        e2.getValue().stream().mapToLong(Long::valueOf).sum(),
//                        e1.getValue().stream().mapToLong(Long::valueOf).sum()
//                ))
//                .forEach(e -> {
//                    System.out.printf("%s: ", e.getKey());
//                    e.getValue().stream()
//                            .sorted((e1, e2) -> Long.compare(e2, e1))
//                            .limit(5)
//                            .forEach(e1 -> System.out.print(e1 + " "));
//
//                    System.out.println();
//                });


    }
}
