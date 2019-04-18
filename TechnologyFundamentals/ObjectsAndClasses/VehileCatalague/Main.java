package ObjectsAndClasses.VehileCatalague;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";
        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(input = reader.readLine())){
            String[] data = input.split("\\s+");

            Vehicle vehicle = new Vehicle(
                    data[0],
                    data[1],
                    data[2],
                    Integer.parseInt(data[3])
            );
            vehicles.add(vehicle);
        }

        String model = reader.readLine();

        while (!"Close the Catalogue".equals(model)){

            String finalModel = model;
            vehicles.stream().filter(e -> e.getModel().equals(finalModel))
                    .forEach(System.out::println);

            model = reader.readLine();
        }

        double cars = Vehicle.averageHorsePower(vehicles.stream()
                .filter(e -> e.getType().equals("car"))
                .collect(Collectors.toList()));

        double trucks = Vehicle.averageHorsePower(vehicles.stream()
                .filter(e -> e.getType().equals("truck"))
                .collect(Collectors.toList()));

        System.out.printf("Cars have average horsepower of: %.2f.\n", cars);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", trucks);




    }
}
