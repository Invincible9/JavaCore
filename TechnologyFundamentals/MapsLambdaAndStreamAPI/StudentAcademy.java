package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class StudentAcademy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, List<Double>> students =
                new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            double grade = Double.parseDouble(reader.readLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        LinkedHashMap<String, Double> averageGrades =
                new LinkedHashMap<>();

        students.forEach((key, value) -> {
            double sum = value.stream()
                    .reduce(0.0, (e1, e2) -> e1 + e2);
            averageGrades.put(key, sum / value.size());
        });

        averageGrades.entrySet().stream()
                .filter(e -> e.getValue() >= 4.50)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(e -> {
            System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue()));
        });
    }


}
