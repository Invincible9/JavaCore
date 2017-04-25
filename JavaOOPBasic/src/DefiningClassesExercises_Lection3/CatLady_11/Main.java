package DefiningClassesExercises_Lection3.CatLady_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Mihail on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        HashMap<String, Cat> catHashMap = new HashMap<>();

        Cat cat = null;
        while (!info.equals("End")) {
            String[] infoSplit = info.split("\\s+");
            String name = infoSplit[1];
            String special = infoSplit[2];

            String command = infoSplit[0];
            switch (command) {
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(name, special);
                    break;
                case "Cymric":
                    cat = new Cymric(name, special);
                    break;
                case "Siamese":
                    cat = new Siamese(name, special);
                    break;
            }
            catHashMap.put(name, cat);

            info = reader.readLine();
        }

        String searchingCat = reader.readLine();
        System.out.println(catHashMap.get(searchingCat));

    }
}
