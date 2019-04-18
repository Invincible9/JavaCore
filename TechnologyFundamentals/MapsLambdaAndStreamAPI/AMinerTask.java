package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.io.InputStreamReader;

public class AMinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = reader.readLine())){
            Integer quantity = Integer.parseInt(reader.readLine());

            if(!resources.containsKey(input)){
                resources.put(input, quantity);
            }else{
                resources.put(input, resources.get(input) + quantity);
            }
        }

        resources.forEach((key, value) -> System.out.println(
                String.format("%s -> %d", key, value)
        ));
    }
}
