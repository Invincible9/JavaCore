package DefiningClassesExercises_Lection3.CarSalesman_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int enginesCount = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, Engine> linkedHashMap = new LinkedHashMap<>();

        while (enginesCount-- > 0) {
            String[] carsInfo = reader.readLine().split("\\s+");

            String modelCar = carsInfo[0];
            String modelPower = carsInfo[1];

            Engine engine = null;

            switch (carsInfo.length) {
                case 2:
                    engine = new Engine(modelCar, modelPower);
                    break;
                case 3:
                    try {
                        int displacement = Integer.parseInt(carsInfo[2]);
                        engine = new Engine(modelCar, modelPower, displacement);
                    } catch (IllegalArgumentException ex) {
                        String displacement = carsInfo[2];
                        engine = new Engine(modelCar, modelPower, displacement);
                    }
                    break;
                case 4:
                    String displacement = carsInfo[2];
                    String efficiency = carsInfo[3];
                    engine = new Engine(modelCar, modelPower, displacement, efficiency);
                    break;
            }

            if (!linkedHashMap.containsKey(modelCar)) {
                linkedHashMap.put(modelCar, engine);
            }
        }

        int carsCount = Integer.parseInt(reader.readLine());

        while (carsCount-- > 0) {
            String[] carsInfo = reader.readLine().split("\\s+");

            String modelEngine = carsInfo[0];
            Engine engine = linkedHashMap.get(carsInfo[1]);

            Car car = null;

            switch (carsInfo.length) {
                case 2:
                    car = new Car(modelEngine, engine);
                    break;
                case 3:
                    try {
                        int weight = Integer.parseInt(carsInfo[2]);
                        car = new Car(modelEngine, engine, weight);
                    } catch (IllegalArgumentException ex) {
                        String weight = carsInfo[2];
                        car = new Car(modelEngine, engine, weight);
                    }
                    break;
                case 4:
                    String weight = carsInfo[2];
                    String color = carsInfo[3];
                    car = new Car(modelEngine, engine, weight, color);
                    break;
            }

            System.out.println(car);

        }

    }
}
