package IteratorsAndComperators_Exercises.ComparingObject_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/25/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        List<Person> personList = new ArrayList<>();

        int equalPeoples = 0;
        int notEqualPeoples = 0;

        while (!info.equals("END")) {
            String[] infoPeople = info.split("\\s+");

            Person person = new Person(infoPeople[0], Integer.parseInt(infoPeople[1]), infoPeople[2]);

            personList.add(person);

            info = reader.readLine();
        }

        Person p = personList.get(Integer.valueOf(reader.readLine()) - 1);
        for (Person person : personList) {
            if (p.compareTo(person) == 0) {
                equalPeoples++;
            } else {
                notEqualPeoples++;
            }
        }

        System.out.println(equalPeoples > 1 ? equalPeoples + " " + notEqualPeoples + " " + (personList.size()) : "No matches");


    }
}
