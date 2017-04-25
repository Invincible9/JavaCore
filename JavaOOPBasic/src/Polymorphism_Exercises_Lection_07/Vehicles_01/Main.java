package Polymorphism_Exercises_Lection_07.Vehicles_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");

        HashMap<String, Vehicle> hashMap = new HashMap<>();

        Vehicle car = new Car(Double.valueOf(carTokens[1]), Double.parseDouble(carTokens[2]));
        Vehicle truck = new Truck(Double.valueOf(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        if (!hashMap.containsKey(carTokens[0])) {
            hashMap.put(carTokens[0], car);
        }

        if (!hashMap.containsKey(truckTokens[0])) {
            hashMap.put(truckTokens[0], truck);
        }

        int numberOfCommands = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfCommands; i++) {

            String[] command = reader.readLine().split("\\s+");

            try {
                switch (command[0]) {
                    case "Drive":
                        hashMap.get(command[1]).driveDistance(Double.parseDouble(command[2]));
                        break;
                    case "Refuel":
                        hashMap.get(command[1]).refueledWithGivenLiters(Double.parseDouble(command[2]));
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

}
