package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/**
 * Created by Mihail on 4/6/2017.
 */
public class PeriodicTable_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        TreeSet<String> chemicalElements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = reader.readLine().split("\\s+");

            for (String element : elements) {
                if(!chemicalElements.contains(element)) {
                    chemicalElements.add(element);
                }
            }
        }

        int counter = 0;
        for (String chemicalElement : chemicalElements) {
            if(counter != chemicalElements.size() - 1) {
                System.out.print(chemicalElement + " ");
            }else{
                System.out.println(chemicalElement);
            }
            counter++;
        }

    }
}
