package JavaOOPBasicsExam12March2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/12/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CarManager manager = new CarManager();

        String info = reader.readLine();

        while (!info.equals("Cops Are Here")) {
            String[] infoSplit = info.split("\\s+");

            //1 Performance BMV M92 2013 300 4 150 75

            /*
            int id, String type, String brand,
             String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability
             */

            int id = Integer.parseInt(infoSplit[1]);

            switch (infoSplit[0].toLowerCase()) {
                case "register":
                    String type = infoSplit[2];
                    String brand = infoSplit[3];
                    String model = infoSplit[4];
                    int yearOfProduction = Integer.parseInt(infoSplit[5]);
                    int hoursePower = Integer.parseInt(infoSplit[6]);
                    int acceleration = Integer.parseInt(infoSplit[7]);
                    int suspension = Integer.parseInt(infoSplit[8]);
                    int durability = Integer.parseInt(infoSplit[9]);

                    manager.register(id, type, brand, model, yearOfProduction, hoursePower, acceleration, suspension, durability);
                    break;
                case "check":
                    manager.check(id);
                    break;
                case "open":
                    int rId = Integer.parseInt(infoSplit[1]);
                    String raceType = infoSplit[2];
                    int length = Integer.parseInt(infoSplit[3]);
                    String route = infoSplit[4];
                    int prizePool = Integer.parseInt(infoSplit[5]);
                    manager.open(rId, raceType, length, route, prizePool);
                    break;
                case "participate":
                    int carId = Integer.parseInt(infoSplit[1]);
                    int raceId = Integer.parseInt(infoSplit[2]);
                    manager.participate(carId, raceId);
                    break;
                case "start":
                    manager.start(id);
                    break;
                case "park":
                    manager.park(id);
                    break;
                case "unpark":
                    manager.unpark(id);
                    break;
                case "tune":
                    int tuneIndex = Integer.parseInt(infoSplit[1]);
                    String addOn = infoSplit[2];
                    manager.tune(tuneIndex, addOn);
                    break;
            }
            info = reader.readLine();
        }

    }
}
