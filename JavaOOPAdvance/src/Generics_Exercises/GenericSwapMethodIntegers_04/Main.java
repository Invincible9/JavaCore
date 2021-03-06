package Generics_Exercises.GenericSwapMethodIntegers_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        Box box = new Box();
        while(count-- > 0){
            Integer numbers = Integer.parseInt(reader.readLine());

            box.addElement(numbers);
        }

        String[] indices = reader.readLine().split("\\s+");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);

        box.swapElements(firstIndex, secondIndex);

        System.out.println(box.toString());


    }
}
