package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ForceBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        Map<String, Set<String>> forceBook = new LinkedHashMap<>();

        while (!"Lumpawaroo".equals(input = reader.readLine())) {
            String[] data = Arrays.stream(input.split("\\s+\\|\\s+|\\s+->\\s+"))
                    .filter(e -> !e.equals(""))
                    .toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new LinkedHashSet<>());
                }

                if(forceBook.values().stream().noneMatch(e -> e.contains(forceUser))){
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = data[0];
                String forceSide = data[1];

                if(!forceBook.containsKey(forceSide)){
                    forceBook.put(forceSide, new LinkedHashSet<>());
                }

                forceBook.forEach((key, value) -> value.remove(forceUser));
                forceBook.get(forceSide).add(forceUser);
                System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));
            }
        }

        forceBook
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }

                    return sort;
                }).forEach(e -> {
            System.out.println(String.format("Side: %s, Members: %d", e.getKey(), e.getValue().size()));
            e.getValue().stream().sorted(String::compareTo)
                    .forEach(v -> {
                        System.out.println(String.format("! %s", v));
                    });
        });

    }
}
