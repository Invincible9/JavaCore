package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        Map<String, Set<String>> users =
                new TreeMap<>();

        while (!"End".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+->\\s+");

            String companyName = data[0];
            String employeeId = data[1];

            if (!users.containsKey(companyName)) {
                users.put(companyName, new LinkedHashSet<>());
            }

            users.get(companyName).add(employeeId);
        }

        users.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(e -> {
                System.out.println(String.format("-- %s", e));
            });
        });

    }
}
