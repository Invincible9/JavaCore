package DefiningClassesExercises_Lection3.OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Mihail on 2/22/2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(input.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] peoplesInfo = input.nextLine().split(" ");
            Person person = new Person();

            person.setName(peoplesInfo[0]);
            person.setAge(Integer.parseInt(peoplesInfo[1]));
            personList.add(person);
        }

        personList.stream()
                .filter(p -> p.getAge() > 30)
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));


    }

}
