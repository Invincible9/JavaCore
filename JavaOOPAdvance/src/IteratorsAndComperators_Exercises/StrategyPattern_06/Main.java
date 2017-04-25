package IteratorsAndComperators_Exercises.StrategyPattern_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Mihail on 3/26/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> nameComparatorSet = new TreeSet<>(new NameComparator());
        Set<Person> ageComparatorSet = new TreeSet<>(new AgeComparator());

        int countPersons = Integer.parseInt(reader.readLine());

        while (countPersons-- > 0) {
            String[] info = reader.readLine().split("\\s+");

            Person person = new PersonImpl(info[0], Integer.parseInt(info[1]));

            nameComparatorSet.add(person);
            ageComparatorSet.add(person);
        }

        nameComparatorSet.forEach(System.out::println);
        ageComparatorSet.forEach(System.out::println);

    }
}
