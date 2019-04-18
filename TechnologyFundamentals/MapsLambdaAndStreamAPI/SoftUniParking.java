package MapsLambdaAndStreamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class SoftUniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, String> parkingSystem =
                new LinkedHashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");

            String command = data[0];
            String username = data[1];

            switch (command) {

                case "register":
                    if (!parkingSystem.containsKey(username)) {
                        parkingSystem.put(username, data[2]);
                        System.out.println(String.format("%s registered %s successfully",
                                username, data[2]));
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n",
                                data[2]);
                    }
                    break;
                case "unregister":
                    if (!parkingSystem.containsKey(username)) {
                        System.out.println(String.format("ERROR: user %s not found",
                                username));
                    } else {
                        parkingSystem.remove(username);
                        System.out.println(String.format("%s unregistered successfully", username));
                    }
                    break;
            }
        }

        parkingSystem.forEach((key, value) -> {
            System.out.println(String.format("%s => %s", key, value));
        });
    }

}
