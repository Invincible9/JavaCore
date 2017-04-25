package Generics_Exercises.GenericCountMethodString_05;

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
            String info = reader.readLine();

            box.addElement(info);
        }

        String searchingWord = reader.readLine();

        System.out.println(box.compare(searchingWord));


    }
}
