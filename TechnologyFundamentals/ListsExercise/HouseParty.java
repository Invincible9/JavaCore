package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HouseParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        int n = Integer.parseInt(reader.readLine());

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");

            String name = data[0];

            if (data[2].equals("not")) {
                if (!names.contains(name)) {
                    System.out.printf("%s is not in the list!\n", name);
                }
                names.remove(name);
            } else {
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    names.add(name);
                }
            }
        }

        System.out.println(String.join("\n", names));

    }
}
