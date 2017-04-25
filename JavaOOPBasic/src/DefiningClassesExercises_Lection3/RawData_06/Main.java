package DefiningClassesExercises_Lection3.RawData_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 2/25/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = reader.readLine().split("\\s+");

            Car car = null;
            String model = info[0];
            int engineSpeed = Integer.parseInt(info[1]);
            int enginePower = Integer.parseInt(info[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(info[3]);
            String cargoType = info[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tires> tiresList = new ArrayList<>();
            for (int j = 5; j < info.length - 1; j += 2) {
                Double tirePressure = Double.parseDouble(info[j]);
                Integer tireAge = Integer.parseInt(info[j + 1]);
                Tires tires = new Tires(tirePressure, tireAge);
                tiresList.add(tires);
            }

            car = new Car(model, engine, cargo, tiresList);
            carList.add(car);

        }

        String command = reader.readLine();

        if (command.equals("fragile")) {
            carList.stream()
                    .filter(car -> car.getTiresList().stream()
                            .filter(pr -> pr.getPressure() < 1).collect(Collectors.toList()).size() > 0)
                                .filter(car -> car.getCargo().getType().equals("fragile"))
                    .forEach(System.out::println);
        } else {
            carList.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(System.out::println);
        }

    }

}
