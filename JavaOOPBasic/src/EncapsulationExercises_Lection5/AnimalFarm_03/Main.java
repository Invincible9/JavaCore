package EncapsulationExercises_Lection5.AnimalFarm_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 2/24/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        Integer age = Integer.parseInt(reader.readLine());

        Chicken chicken = null;
        try {
            chicken = new Chicken(name, age);
            System.out.println(chicken.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
