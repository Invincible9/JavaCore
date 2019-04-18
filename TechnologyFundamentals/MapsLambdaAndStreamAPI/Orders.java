package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Orders {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> nameWithQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> nameWithPrice = new LinkedHashMap<>();

        String input = "";

        while (!"buy".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!nameWithQuantity.containsKey(name)) {
                nameWithQuantity.put(name, quantity);
            } else {
                nameWithQuantity.put(name, nameWithQuantity.get(name) + quantity);
            }

            nameWithPrice.put(name, price);
        }

        nameWithPrice = nameWithPrice.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> {throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        nameWithPrice.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key,
                value * nameWithQuantity.get(key))));
    }
}
