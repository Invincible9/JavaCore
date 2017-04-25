package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 4/6/2017.
 */
public class HandsOfCards_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        LinkedHashMap<String, Set<String>> nameCards = new LinkedHashMap<>();

        while (!info.equals("JOKER")) {
            int index = info.indexOf(":");
            String name = info.substring(0, index);

            String cards = info.substring(index + 2);
            String[] cardsSplit = cards.trim().split(", ");
            Set<String> card = new HashSet<>();

            for (String s : cardsSplit) {
                if (!card.contains(s)) {
                    card.add(s);
                }
            }

            if (!nameCards.containsKey(name)) {
                nameCards.put(name, card);
            } else {
                for (String s : cardsSplit) {
                    nameCards.get(name).add(s);
                }
            }

            info = reader.readLine();
        }

        for (String key : nameCards.keySet()) {
            long finalResult = 0;
            for (String card : nameCards.get(key)) {
                String power = card.substring(0, card.length() - 1);
                String type = card.substring(card.length() - 1);
                long result = calcPower(power) * calcType(type);
                finalResult += result;
            }
            System.out.println(key + ": " + finalResult);
        }

    }

    public static long calcPower(String power) {

        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                break;
        }
        return 0;
    }

    public static int calcType(String type) {

        switch (type) {
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;
            default:
                break;
        }
        return 0;
    }

}
