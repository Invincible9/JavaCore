package Generics_Exercises.GenericBox_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Box<String> box = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());


        while (count-- > 0){
            String text = reader.readLine();
            box = new Box(text);
            System.out.println(box.toString());
        }

    }


}
