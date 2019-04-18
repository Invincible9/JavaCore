package ObjectsAndClasses.OrderByAge;

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

        String input = "";

        List<Person> people = new ArrayList<>();

        while (!"End".equals(input = reader.readLine())){
            String[] data = input.split("\\s+");
            Person person = new Person(data[0], data[1],
                    Integer.parseInt(data[2]));
            people.add(person);
        }

        people.stream().sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }
}
