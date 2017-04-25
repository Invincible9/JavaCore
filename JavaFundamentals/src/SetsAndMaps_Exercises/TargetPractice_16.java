package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Mihail on 4/20/2017.
 */
public class TargetPractice_16 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizeMatrix = Arrays.stream(reader.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        String text = reader.readLine().trim();

        String[][] matrix = new String[rows][cols];

        int count = 0;
        boolean isMovingLeft = true;

        for (int i = matrix.length - 1; i >= 0; i--) {

            if (isMovingLeft) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[i][j] = String.valueOf(text.charAt(count % text.length()));
                    count++;
                }
                isMovingLeft = false;
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = String.valueOf(text.charAt(count % text.length()));
                    count++;
                }
                isMovingLeft = true;
            }

        }

        int[] targetCoord = Arrays.stream(reader.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = targetCoord[0];
        int col = targetCoord[1];
        int radius = targetCoord[2];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    if (Math.pow(i - row, 2) + Math.pow(j - col, 2) <= Math.pow(radius, 2)) {
                        matrix[i][j] = " ";
                    }
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (!matrix[i][j].equals(" ")) {
//                    for (int k = i; k < matrix.length - 1; k++) {
//                        if (matrix[k + 1][j].equals(" ")) {
//                            matrix[k + 1][j] = matrix[k][j];
//                            matrix[k][j] = " ";
//                        }
////                        else {
////                            break;
////                        }
//                    }
//                }
//            }
//        }

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (!matrix[j][i].equals(" ")) {
                    for (int k = j; k < matrix.length - 1; k++) {
                        if (matrix[k + 1][i].equals(" ")) {
                            matrix[k + 1][i] = matrix[k][i];
                            matrix[k][i] = " ";
                        }
//                        else {
//                            break;
//                        }
                    }
                }
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
