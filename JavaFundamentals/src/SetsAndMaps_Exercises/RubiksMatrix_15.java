package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Mihail on 4/12/2017.
 */
public class RubiksMatrix_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizeMatrix = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        int[][] matrix = new int[rows][cols];

        int couner = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = couner++;
            }
        }

        int[][] cloneMatrix = copyMatrix(matrix);

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] commands = reader.readLine().split("\\s+");
            int rowOrColumn = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int move = Integer.parseInt(commands[2]);

            switch (direction) {
                case "up":

                    for (int i = 0; i < move % cols; i++) {
                        int firstEl = cloneMatrix[0][rowOrColumn];
                        for (int j = 0; j < cloneMatrix.length - 1; j++) {
                            cloneMatrix[j][rowOrColumn] = cloneMatrix[j + 1][rowOrColumn];
                        }
                        cloneMatrix[cloneMatrix[rowOrColumn].length - 1][rowOrColumn] = firstEl;
                    }

                    break;
                case "down":

                    for (int i = 0; i < move % cols; i++) {

                        int lastElUp = cloneMatrix[cloneMatrix[rowOrColumn].length - 1][rowOrColumn];
                        for (int j = cloneMatrix.length - 1; j >= 1; j--) {
                            cloneMatrix[j][rowOrColumn] = cloneMatrix[j - 1][rowOrColumn];
                        }
                        cloneMatrix[0][rowOrColumn] = lastElUp;
                    }

                    break;
                case "left":
                    for (int i = 0; i < move % rows; i++) {
                        int firstEl = cloneMatrix[rowOrColumn][0];
                        for (int j = 0; j < cloneMatrix.length - 1; j++) {
                            cloneMatrix[rowOrColumn][j] = cloneMatrix[rowOrColumn][j + 1];
                        }
                        cloneMatrix[rowOrColumn][cloneMatrix[rowOrColumn].length - 1] = firstEl;
                    }
                    break;
                case "right":
                    for (int i = 0; i < move % rows; i++) {
                        int lastEl = cloneMatrix[rowOrColumn][cloneMatrix[rowOrColumn].length - 1];

                        for (int j = cloneMatrix.length - 1; j >= 1; j--) {
                            cloneMatrix[rowOrColumn][j] = cloneMatrix[rowOrColumn][j - 1];
                        }
                        cloneMatrix[rowOrColumn][0] = lastEl;
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int matrixElement = matrix[i][j];
                int cloneElement = cloneMatrix[i][j];
                if(matrixElement == cloneElement){
                    sb.append("No swap required\n");
                }else{
                    for (int k = 0; k < cloneMatrix.length; k++) {
                        for (int l = 0; l < cloneMatrix[k].length; l++) {
                            if(cloneMatrix[k][l] == matrixElement){
                                cloneMatrix[i][j] = matrixElement;
                                cloneMatrix[k][l] = cloneElement;
                                sb.append(String.format("Swap (%d, %d) with (%d, %d)\n", i, j, k, l));
                                break;
                            }
                        }
                    }
                }
            }
        }

        String result = sb.toString();
        System.out.println(result);

    }

    private static int[][] copyMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] copyMatrix = new int[row][col];

        for (int i = 0; i < copyMatrix.length; i++) {
            for (int j = 0; j < copyMatrix[i].length; j++) {
                copyMatrix[i][j] = matrix[i][j];
            }
        }

        return copyMatrix;
    }
}
