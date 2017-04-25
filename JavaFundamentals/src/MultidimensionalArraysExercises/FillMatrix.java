package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/24/2017.
 */
public class FillMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] param = input.nextLine().split(", ");

        int N = Integer.parseInt(param[0]);
        String type = param[1];

        int counter = 1;

        int[][] matrix = new int[N][N];

        if (type.equals("A")) {
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = counter++;
                }
            }
            printMatrix(matrix);
        } else if (type.equals("B")) {
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix[col].length; row++) {
                        matrix[row][col] = counter++;
                    }
                } else {
                    for (int row = matrix[col].length - 1; row >= 0; row--) {
                        matrix[row][col] = counter++;
                    }
                }
            }
            printMatrix(matrix);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
