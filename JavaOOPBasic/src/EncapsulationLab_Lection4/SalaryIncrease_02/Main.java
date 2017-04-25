package EncapsulationLab_Lection4.SalaryIncrease_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 2/23/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = reader.readLine().split("\\s+");
            personList.add(new Person(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3])));
        }

        double bonus = Double.parseDouble(reader.readLine());

        for (Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }

}
