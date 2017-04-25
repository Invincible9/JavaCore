package DefiningClassesExercises_Lection3.SpeedRacing_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int carCount = Integer.parseInt(reader.readLine());

        List<Car> carList = new ArrayList<>();

        Car car = null;
        while (carCount-- > 0) {
            String[] cars = reader.readLine().split("\\s+");
            String model = cars[0];
            double fuelAmount = Double.parseDouble(cars[1]);
            double fuelCostFor1km = Double.parseDouble(cars[2]);

            car = new Car(model, fuelAmount, fuelCostFor1km);
            carList.add(car);
        }

        String info = reader.readLine();

        while (!info.equals("End")) {
            String[] infoSplit = info.split("\\s+");
            String command = infoSplit[0];
            String carModel = infoSplit[1];
            int amountOfKm = Integer.parseInt(infoSplit[2]);

            if (command.equals("Drive")) {
                for (Car car1 : carList) {
                    if (car1.getModel().equals(carModel)) {
                        car1.calculateFuelForDrive(amountOfKm);
                    }
                }
            }

            info = reader.readLine();
        }

        for (Car car1 : carList) {
            System.out.printf("%s %.2f %d%n", car1.getModel(), car1.getFuelAmount(), car1.getDistanceTraveled());
        }


    }

}
