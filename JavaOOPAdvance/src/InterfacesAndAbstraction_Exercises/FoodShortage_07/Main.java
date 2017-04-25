package InterfacesAndAbstraction_Exercises.FoodShortage_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peopleCount = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, Buyer> people = new LinkedHashMap<>();

        Buyer buyer = null;

        while (peopleCount-- > 0) {
            String[] infoPeople = reader.readLine().split("\\s+");

            if (infoPeople.length == 3) {
                buyer = new Rebel(infoPeople[0], Integer.parseInt(infoPeople[1]), infoPeople[2]);
            } else {
                buyer = new Citizens(infoPeople[0], Integer.parseInt(infoPeople[1]), infoPeople[2], infoPeople[3]);
            }
            people.putIfAbsent(infoPeople[0], buyer);
        }

        String infoName = reader.readLine();


        while (!infoName.equals("End")) {

            if (people.containsKey(infoName)) {
                people.get(infoName).BuyFood();
            }

            infoName = reader.readLine();
        }

//        System.out.println(people.values().stream().mapToInt(b -> b.getFood()).sum());

        long sum = 0;

        for (Map.Entry<String, Buyer> stringBuyerEntry : people.entrySet()) {
            sum += stringBuyerEntry.getValue().getFood();
        }

        System.out.println(sum);

    }
}
