package examTech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, List<String>> equipment =
                new LinkedHashMap<>();

        LinkedHashMap<String, List<String>> stores =
                new LinkedHashMap<>();

        String input = "";

        while (!"END".equals(input = reader.readLine())) {

            String[] data = input.split("\\s*->\\s*");

            String command = data[0];

            switch (command) {
                case "Add":

                    if (!equipment.containsKey(data[1])) {
                        equipment.put(data[1], new ArrayList<>());
                    }
                    equipment.get(data[1]).add(data[2]);

                    if (!stores.containsKey(data[3])) {
                        stores.put(data[3], new ArrayList<>());
                    }
                    stores.get(data[3]).add(data[2]);
                    break;
                case "Remove":
                    equipment.remove(data[1]);
                    break;
            }
        }

        System.out.println("Equipment list:");

        equipment
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;
                }).forEach(e -> {
            System.out.println(e.getKey());
            e
                    .getValue()
                    .forEach(v -> {
                        System.out.println(String.format("--%s", v));
                    });
        });

        System.out.println("Stores list:");
        stores
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .sorted(Comparator.reverseOrder())
                            .forEach(v -> {
                                System.out.println(String.format("<<%s>>", v));
                            });
                });

    }
}
