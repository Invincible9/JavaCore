package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/24/2017.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] params = input.nextLine().split(" ");

        int rows = Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = "" + (char) ('a' + i) + (char) ('a' + i + j) + (char) ('a' + i);
            }
        }

        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }

    }
}
