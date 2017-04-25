package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/27/2017.
 */
public class SquaresInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] params = input.nextLine().split(" ");

        int rows = Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] line = input.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = line[j];
            }
        }

        int count = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                if ((row >= 0 && row < matrix.length) && (col >= 0 && col < matrix[row].length)) {
                    if ((matrix[row][col].equals(matrix[row][col + 1])) && (matrix[row + 1][col].equals(matrix[row + 1][col + 1])) &&
                            matrix[row][col].equals(matrix[row+1][col]) && matrix[row][col+1].equals(matrix[row+1][col+1])) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}
