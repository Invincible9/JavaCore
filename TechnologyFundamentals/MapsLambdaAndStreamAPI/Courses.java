package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Courses {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        LinkedHashMap<String, Set<String>> courses =
                new LinkedHashMap<>();

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+:\\s+");

            String courseName = data[0];
            String studentName = data[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new TreeSet<>());
            }

            courses.get(courseName).add(studentName);
        }

        courses.entrySet().stream()
                .sorted((e1, e2) ->
                        Integer.compare(
                                e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(
                            String.format("%s: %d", e.getKey(), e.getValue().size()));

                    e.getValue().forEach(s -> {
                        System.out.println(String.format("-- %s", s));
                    });
                });

    }
}
