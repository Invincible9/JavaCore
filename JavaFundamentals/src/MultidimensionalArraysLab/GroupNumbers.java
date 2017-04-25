package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mihail on 1/23/2017.
 */
public class GroupNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] line = input.nextLine().split(", ");

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(0, new ArrayList<>());
        matrix.add(1, new ArrayList<>());
        matrix.add(2, new ArrayList<>());

        for (String s : line) {
            int currentNum = Integer.parseInt(s);
            matrix.get(Math.abs(currentNum % 3)).add(currentNum);
        }

        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
