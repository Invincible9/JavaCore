package Polymorphism_Exercises_Lection_07.VehiclesExtension_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Vehicle> hashMap = new LinkedHashMap<>();

        String[] carInfo = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));

        if (!hashMap.containsKey(carInfo[0])) {
            hashMap.put(carInfo[0], car);
        }

        String[] truckInfo = reader.readLine().split("\\s+");

        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));

        if (!hashMap.containsKey(truckInfo[0])) {
            hashMap.put(truckInfo[0], truck);
        }

        String[] busInfo = reader.readLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        if (!hashMap.containsKey(busInfo[0])) {
            hashMap.put(busInfo[0], bus);
        }
        int commandCount = Integer.parseInt(reader.readLine());

        while (commandCount-- > 0) {
            String[] commands = reader.readLine().split("\\s+");

            try {
                switch (commands[0]) {
                    case "Drive":
                        hashMap.get(commands[1]).drivenGivenDistance(Double.parseDouble(commands[2]));
                        break;
                    case "Refuel":
                        hashMap.get(commands[1]).refueledWithGivenLiters(Double.parseDouble(commands[2]));
                        break;
                    case "DriveEmpty":
                        hashMap.get(commands[1]).driveEmptyDistance(Double.parseDouble(commands[2]));
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());

    }
}
