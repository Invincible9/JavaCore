package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadioactiveBunnies_18 {
    static int startPosRow = 0;
    static int startPosCol = 0;
    static boolean isEnd = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizeMatrix = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = sizeMatrix[0];
        int cols = sizeMatrix[1];

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reader.readLine().trim().split("");
        }

        String[] commands = reader.readLine().trim().split("");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    startPosRow = i;
                    startPosCol = j;
                }
            }
        }
        movesPlayer(matrix, commands);
        printMatrix(matrix);
    }

    private static void movesPlayer(String[][] matrix, String[] commands) {

        for (String command : commands) {
            if (!isEnd) {
                switch (command) {
                    case "R":
                        distributionOfRabbits(matrix);
                        PerformMove(matrix, startPosRow, startPosCol + 1);
                        break;
                    case "L":
                        distributionOfRabbits(matrix);
                        PerformMove(matrix, startPosRow, startPosCol - 1);
                        break;
                    case "U":
                        distributionOfRabbits(matrix);
                        PerformMove(matrix, startPosRow - 1, startPosCol);
                        break;
                    case "D":
                        distributionOfRabbits(matrix);
                        PerformMove(matrix, startPosRow + 1, startPosCol);
                        break;
                }
            }
        }
    }

    static void PerformMove(String[][] matrix, int row, int col) {
        if (isValidMove(matrix, row, col)) {
            startPosRow = row;
            startPosCol = col;
            if (matrix[startPosRow][startPosCol].equals("B")) {
                isEnd = true;
            } else {
                matrix[startPosRow][startPosCol] = "P";
            }
        }
    }

    static boolean isValidMove(String[][] matrix, int row, int col) {
        if ((row >= 0 && row < matrix.length) && (col >= 0 && col < matrix[row].length)) {
            return true;
        }
        return false;
    }

    private static void distributionOfRabbits(String[][] matrix) {
        List<int[]> indexes = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")) {
                    indexes.add(new int[]{i, j});
                }
            }
        }

        for (int[] index : indexes) {
            if (index[0] > 0) {
                matrix[index[0] - 1][index[1]] = "B";
            }
            if (index[0] + 1 <= matrix.length - 1) {
                matrix[index[0] + 1][index[1]] = "B";
            }
            if (index[1] > 0) {
                matrix[index[0]][index[1] - 1] = "B";
            }
            if (index[1] + 1 <= matrix[0].length - 1) {
                matrix[index[0]][index[1] + 1] = "B";
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    matrix[i][j] = ".";
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        if (!isEnd) {
            System.out.printf("won: %d %d", startPosRow, startPosCol);
        } else {
            System.out.printf("dead: %d %d", startPosRow, startPosCol);
        }
    }
}