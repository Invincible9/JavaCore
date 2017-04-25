package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/26/2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(input.nextLine());

        long[][] matrix = new long[sizeMatrix][sizeMatrix];

        for (int row = 0; row < matrix.length; row++) {
            String[] line = input.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Long.parseLong(line[col]);
            }
        }

        long leftSum = leftToRightDiagonal(matrix);
        long rightSum = rightToLeftDiagonal(matrix);
        long difference = Math.abs(leftSum - rightSum);

        System.out.println(difference);

    }

    private static long leftToRightDiagonal(long[][] matrix) {
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static long rightToLeftDiagonal(long[][] matrix) {
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
}
