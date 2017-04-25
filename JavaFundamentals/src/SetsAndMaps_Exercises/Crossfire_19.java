package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Mihail on 4/22/2017.
 */
public class Crossfire_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizeMatrix = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        String[][] matrix = new String[rows][cols];

        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = String.valueOf(count++);
            }
        }

        String info = reader.readLine();
        while (!info.equals("Nuke it from orbit")) {
            int[] commands = Arrays.stream(info.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int row = commands[0];
            int col = commands[1];
            int radius = commands[2];

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

            info = reader.readLine();
        }


        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
