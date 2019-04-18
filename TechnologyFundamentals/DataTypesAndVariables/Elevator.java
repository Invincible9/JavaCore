package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader
                = new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
        );


        int numberOfPeople = Integer.parseInt(reader.readLine());
        int capacityOfPersons = Integer.parseInt(reader.readLine());

        System.out.println((int)Math.ceil((double)numberOfPeople/capacityOfPersons));

    }
}
