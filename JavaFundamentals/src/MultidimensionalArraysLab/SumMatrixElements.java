package MultidimensionalArraysLab;

import java.util.Scanner;

/**
 * Created by Mihail on 1/23/2017.
 */
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matrixLen = input.nextLine().split(", ");

        int rows = Integer.parseInt(matrixLen[0]);
        int cols = Integer.parseInt(matrixLen[1]);

        int[][] matrix = new int[rows][cols];


        for (int i = 0; i < matrix.length; i++) {
            String[] lines = input.nextLine().split(", ");

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(lines[j]);
            }
        }

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        long sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);


    }
}
