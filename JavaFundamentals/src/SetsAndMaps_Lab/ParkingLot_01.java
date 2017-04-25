package SetsAndMaps_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * Created by Mihail on 4/6/2017.
 */
public class ParkingLot_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> carNumbers = new HashSet<>();

        String info = reader.readLine();

        while (!info.equals("END")) {
            String[] infoSplit = info.split(", ");

            switch (infoSplit[0]) {
                case "IN":
                    carNumbers.add(infoSplit[1]);
                    break;
                case "OUT":
                    carNumbers.remove(infoSplit[1]);
                    break;
            }
            info = reader.readLine();
        }

        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }

}
