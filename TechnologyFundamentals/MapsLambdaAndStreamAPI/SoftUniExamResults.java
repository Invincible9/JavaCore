package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniExamResults {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        Map<String, Integer> examResults =
                new LinkedHashMap<>();

        Map<String, Integer> submissions = new LinkedHashMap<>();

        String input = "";

        while (!"examTech finished".equals(input = reader.readLine())) {
            String[] data = input.split("-");

            String username = data[0];

            if (data.length == 3) {
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if(!examResults.containsKey(username)){
                    examResults.put(username, points);
                }
                if(examResults.get(username) < points) {
                    examResults.put(username, points);
                }

                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }

            } else {
                examResults.remove(username);
            }
        }

        System.out.println("Results:");
        examResults.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = e2.getValue().compareTo(e1.getValue());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }

                    return sort;
                }).forEach(e -> {
            System.out.println(String.format("%s | %d", e.getKey(), e.getValue()));
        });

        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = e2.getValue().compareTo(e1.getValue());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }

                    return sort;
                }).forEach(e -> {
            System.out.println(String.format("%s - %d", e.getKey(), e.getValue()));
        });


    }
}
