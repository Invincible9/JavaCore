package Generics_Exercises.GenericCountMethodIntegers_06;

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
            Double numbers = Double.parseDouble(reader.readLine());

            box.addElement(numbers);
        }

        Double searchingWord = Double.parseDouble(reader.readLine());

        System.out.println(box.compare(searchingWord));


    }
}
