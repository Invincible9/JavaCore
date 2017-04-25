package MultidimensionalArraysExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Mihail on 4/21/2017.
 */
public class LegoBlocks_17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < numbers.length; j++) {
                line.add(numbers[j]);
            }
            matrix1.add(line);
        }

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(reader.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < numbers.length; j++) {
                line.add(numbers[j]);
            }
            Collections.reverse(line);
            matrix2.add(line);
        }

        for (int i = 0; i < matrix2.size(); i++) {
            for (int j = 0; j < matrix2.get(i).size(); j++) {
                matrix1.get(i).add(matrix2.get(i).get(j));
            }
        }

        if (matrix1.get(0).size() != matrix1.get(matrix1.size() - 1).size()) {
            int sum = 0;
            int count = 0;
            while (matrix1.size() > count) {
                sum += matrix1.get(count).size();
                count++;
            }
            System.out.printf("The total number of cells is: %d", sum);
        } else {
            for (ArrayList<Integer> integerArrayList : matrix1) {
                System.out.println(integerArrayList);
            }
        }
    }

}
