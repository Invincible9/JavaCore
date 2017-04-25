package Generics_Exercises.Tuple_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/18/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().split("\\s+");
        String[] secondLine = reader.readLine().split("\\s+");
        String[] thirdLine = reader.readLine().split("\\s+");

        Tuple tuple1 = new Tuple(firstLine[0] + " " + firstLine[1], firstLine[2]);
        Tuple tuple2 = new Tuple(secondLine[0], Integer.parseInt(secondLine[1]));
        Tuple tuple3 = new Tuple(Integer.parseInt(thirdLine[0]), Double.parseDouble(thirdLine[1]));

        System.out.println(tuple1);
        System.out.println(tuple2);
        System.out.println(tuple3);


    }

}
