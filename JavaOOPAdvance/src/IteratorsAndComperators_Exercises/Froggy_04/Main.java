package IteratorsAndComperators_Exercises.Froggy_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Mihail on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        Lake lake = new Lake();
        while (!info.equals("END")) {
            String[] numbers = info.split(", |\\s+");

//            Arrays.sort(numbers);

            lake = new Lake(numbers.length);
//            lake.foundOdd();

            for (int i = 0; i < numbers.length; i++) {
                lake.CreateEl(Integer.parseInt(numbers[i]));
            }
            info = reader.readLine();
        }

//        String previousSeparator = "";
//        while (lake.iterator().hasNext()) {
//            System.out.print(previousSeparator + lake.iterator().next());
//            previousSeparator = ", ";
//        }

        lake.printElements();




    }
}
