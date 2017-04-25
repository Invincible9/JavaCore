package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Mihail on 4/6/2017.
 */
public class Phonebook_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> persons = new HashMap<>();

        while (true) {
            String command = reader.readLine();

            if (command.equals("search")) {
                break;
            }
            String[] infoPerson = command.split("-");

            if (!persons.containsKey(infoPerson[0])) {
                persons.put(infoPerson[0], infoPerson[1]);
            }
        }

        String info = reader.readLine();

        while (!info.equals("stop")) {

            if (persons.containsKey(info)) {
                System.out.println(info + " -> " + persons.get(info));
            } else {
                System.out.printf("Contact %s does not exist.\n", info);
            }

            info = reader.readLine();
        }

    }
}
