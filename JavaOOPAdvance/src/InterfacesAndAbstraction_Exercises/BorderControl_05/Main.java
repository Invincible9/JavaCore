package InterfacesAndAbstraction_Exercises.BorderControl_05;

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

        Soldier soldier = null;

        while (!info.equals("End")) {
            String[] infoSplit = info.split("\\s+");

            if (infoSplit.length == 2) {
                soldier = new Robots(infoSplit[0], infoSplit[1]);
                Ids.add(soldier);
            } else {
                soldier = new Citizens(infoSplit[0], Integer.parseInt(infoSplit[1]), infoSplit[2]);
                Ids.add(soldier);
            }
            info = reader.readLine();
        }

        String searchingId = reader.readLine();

        for (Soldier id : Ids) {
            String idChecker = id.getId().substring(id.getId().length() - searchingId.length());
            if (idChecker.equals(searchingId)) {
                System.out.println(id.getId());
            }
        }

    }
}
