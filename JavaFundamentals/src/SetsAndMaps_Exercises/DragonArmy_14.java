package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 4/11/2017.
 */
public class DragonArmy_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        LinkedHashMap<String, TreeMap<String, ArrayList<Long>>> army = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] info = reader.readLine().split("\\s+");

            String type = info[0];
            String name = info[1];
            long damage = info[2].equals("null") ? 45 : Long.parseLong(info[2]);
            long health = info[3].equals("null") ? 250 : Long.parseLong(info[3]);
            long armor = info[4].equals("null") ? 10 : Long.parseLong(info[4]);

            ArrayList<Long> stats = new ArrayList<>();
            stats.add(damage);
            stats.add(health);
            stats.add(armor);

            if (!army.containsKey(type)) {
                army.put(type, new TreeMap<>());
            }

            army.get(type).put(name, stats);
        }

        for (String type : army.keySet()) {
            double sumDmg = 0l;
            double sumHealth = 0l;
            double sumArmor = 0l;

            TreeMap<String, ArrayList<Long>> list = army.get(type);

            for (String s : list.keySet()) {
                sumDmg += list.get(s).get(0);
                sumHealth += list.get(s).get(1);
                sumArmor += list.get(s).get(2);
            }

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", type, sumDmg / list.size(), sumHealth / list.size(), sumArmor / list.size());

            list.entrySet().stream()
                    .forEach(e -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n", e.getKey(),
                            e.getValue().get(0), e.getValue().get(1), e.getValue().get(2)));
        }

    }
}
