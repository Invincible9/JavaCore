package MultidimensionalArraysLab;

import java.util.Scanner;

/**
 * Created by Mihail on 1/23/2017.
 */
public class MaximumSumOf2x2Submatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matrSize = input.nextLine().split(", ");

        int rows = Integer.parseInt(matrSize[0]);
        int cols = Integer.parseInt(matrSize[1]);

        long[][] matrix = new long[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] lines = input.nextLine().split(", ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Long.parseLong(lines[j]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {

                long currentSum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startRow = row;
                    startCol = col;
                }
            }
        }

        for (int i = startRow; i <= startRow + 1; i++) {
            for (int j = startCol; j <= startCol + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}
