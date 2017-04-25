package IteratorsAndComperators_Exercises.EqualityLogic_07;

import javax.naming.Name;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Mihail on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countPeople = Integer.parseInt(reader.readLine());

        Set<PersonImp> nameComparator = new TreeSet<>(new NameComparator());
        Set<PersonImp> ageComparator = new HashSet<>();

        while (countPeople-- > 0) {
            String[] infoPeople = reader.readLine().split("\\s+");

            PersonImp person = new PersonImp(infoPeople[0], Integer.parseInt(infoPeople[1]));

            nameComparator.add(person);
            ageComparator.add(person);
        }

        System.out.println(nameComparator.size());
        System.out.println(ageComparator.size());

    }
}
