package ObjectsAndClasses.OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split(" ");

            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.add(person);
        }

        people
                .stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> {
                    System.out.printf("%s - %d\n", person.getName(),
                            person.getAge());
                });


    }
}
