package IteratorsAndComperators_Exercises.ListyIterator_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        ListyIterator iterator = new ListyIterator();

        while (!info.equals("END")) {
            String[] infoSplit = info.split("\\s+");

            switch (infoSplit[0]) {
                case "Create":
                    for (int i = 1; i < infoSplit.length; i++) {
                        iterator.Create(infoSplit[i]);
                    }
                    break;
                case "HasNext":
                    System.out.println(iterator.hasNext());
                    break;
                case "Move":
                    System.out.println(iterator.Move());
                    break;
                case "Print":
                    try {
                        iterator.Print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
            info = reader.readLine();
        }

    }
}
