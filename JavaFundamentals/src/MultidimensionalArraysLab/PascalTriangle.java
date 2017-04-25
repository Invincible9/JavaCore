package MultidimensionalArraysLab;

import java.util.Scanner;

/**
 * Created by Mihail on 1/23/2017.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = Integer.parseInt(input.nextLine());
        long[][] matrix = new long[row][];

        for (int i = 0; i < row; i++) {
            matrix[i] = new long[i + 1];
        }

        for (int i = 0; i < row; i++) {
            matrix[i][0] = 1;
            matrix[i][matrix[i].length - 1] = 1;
            for (int j = 1; j < matrix[i].length - 1; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        for (long[] longs : matrix) {
            for (long aLong : longs) {
                System.out.print(aLong + " ");
            }
            System.out.println();
        }
    }
}
