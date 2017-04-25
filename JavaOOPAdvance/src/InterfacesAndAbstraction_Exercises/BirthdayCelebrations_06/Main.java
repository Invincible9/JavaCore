package InterfacesAndAbstraction_Exercises.BirthdayCelebrations_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        List<Soldier> Ids = new ArrayList<>();
        List<BirthDate> birthDates = new ArrayList<>();

        Soldier soldier = null;
        BirthDate birthDate = null;

        while (!info.equals("End")) {
            String[] infoSplit = info.split("\\s+");

            switch (infoSplit[0].toLowerCase()) {
                case "robot":
                    soldier = new Robots(infoSplit[1], infoSplit[2]);
                    Ids.add(soldier);
                    break;
                case "pet":
                    birthDate = new Pet(infoSplit[1], infoSplit[2]);
                    birthDates.add(birthDate);
                    break;
                case "citizen":
                    birthDate = new Citizens(infoSplit[1], Integer.parseInt(infoSplit[2]), infoSplit[3], infoSplit[4]);
                    birthDates.add(birthDate);
                    break;
                default:
                    break;
            }
            info = reader.readLine();
        }

        String searchingYear = reader.readLine();

        for (BirthDate year : birthDates) {
            String idChecker = year.getBirthDate().substring(year.getBirthDate().length() - searchingYear.length());
            if (idChecker.equals(searchingYear)) {
                System.out.println(year.getBirthDate());
            }
        }

    }
}
