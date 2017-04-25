package Generics_Exercises.GenericBoxOfInteger_02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Box<Integer> box = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());


        while (count-- > 0){
            Integer number = Integer.parseInt(reader.readLine());
            box = new Box(number);
            System.out.println(box.toString());
        }

    }

}
