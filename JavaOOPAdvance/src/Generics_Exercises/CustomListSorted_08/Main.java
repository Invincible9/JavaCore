package Generics_Exercises.CustomListSorted_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/17/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String commands = reader.readLine();

        CustomList customList = new CustomList();

        while (!commands.equals("END")) {
            String[] info = commands.split("\\s+");


            switch (info[0].toLowerCase()) {
                case "add":
                    String element = info[1];
                    customList.add(element);
                    break;
                case "remove":
                    int index = Integer.parseInt(info[1]);
                    customList.remove(index);
                    break;
                case "contains":
                    String searchingElement = info[1];
                    System.out.println(customList.contains(searchingElement));
                    break;
                case "swap":
                    int firstIndex = Integer.parseInt(info[1]);
                    int secondIndex = Integer.parseInt(info[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "greater":
                    String greaterElement = info[1];
                    System.out.println(customList.countGreaterThat(greaterElement));
                    break;
                case "max":
                    System.out.println(customList.getMax());
                    break;
                case "min":
                    System.out.println(customList.getMin());
                    break;
                case "print":
                    System.out.println(customList.toString());
                    break;
                case "sort":
                    customList.sort();
                default:
                    break;
            }

            commands = reader.readLine();
        }

    }
}
