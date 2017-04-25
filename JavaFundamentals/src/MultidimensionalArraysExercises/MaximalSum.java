package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/27/2017.
 */
public class MaximalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] params = input.nextLine().split(" ");

        int rows = Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);

        long[][] matrix = new long[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] line = input.nextLine().split(" ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Long.parseLong(line[j]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        int firstRowIndex = 0;
        int firstColIndex = 0;


        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                long minSum = 0;
                for (int row = i; row <= i + 2; row++) {
                    for (int col = j; col <= j + 2; col++) {
//                        if ((i >= 0 && i + 2 < matrix.length) && (j >= 0 && j + 2 < matrix[i].length)) {
                            minSum += matrix[row][col];
//                        }

                        if (minSum > maxSum) {
                            maxSum = minSum;
                            firstRowIndex = i;
                            firstColIndex = j;
                        }
                    }
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        for (int i = firstRowIndex; i <= firstRowIndex + 2; i++) {
            for (int j = firstColIndex; j <= firstColIndex + 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
