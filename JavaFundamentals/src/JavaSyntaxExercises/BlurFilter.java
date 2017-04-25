package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/21/2017.
 */
public class BlurFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long blurAmount = input.nextInt();

        int rows = input.nextInt();
        int cols = input.nextInt();

        long[][] matrix = new long[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        int rowCoord = input.nextInt();
        int colCoord = input.nextInt();

        for (int i = rowCoord - 1; i <= rowCoord + 1; i++) {
            for (int j = colCoord - 1; j <= colCoord + 1; j++) {
                if ((i >= 0 && i < matrix.length) && (j >= 0 && j < matrix[i].length)) {
                    matrix[i][j] += blurAmount;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
