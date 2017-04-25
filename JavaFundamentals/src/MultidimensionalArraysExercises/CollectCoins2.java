package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 2/5/2017.
 */
public class CollectCoins2 {

    static int currentRow = 0;
    static int currentCol = 0;
    static int coins = 0;
    static int walls = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] matrix = new String[4][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextLine().split("");
        }

        String[] commands = input.nextLine().split("");

        for (String command : commands) {
            switch (command) {
                case "^":
                    if (ValidMove(matrix, currentRow - 1, currentCol)) {
                        currentRow--;
                        CollectCoin(matrix);
                    } else {
                        walls++;
                    }

                    break;
                case "V":
                    if (ValidMove(matrix, currentRow + 1, currentCol)) {
                        currentRow++;
                        CollectCoin(matrix);
                    } else {
                        walls++;
                    }
                    break;
                case ">":

                    if (ValidMove(matrix, currentRow, currentCol + 1)) {
                        currentCol++;
                        CollectCoin(matrix);
                    } else {
                        walls++;
                    }
                    break;
                case "<":
                    if (ValidMove(matrix, currentRow, currentCol - 1)) {
                        currentCol--;
                        CollectCoin(matrix);
                    } else {
                        walls++;
                    }
                    break;
            }
        }

        System.out.println("Coins = " + coins);
        System.out.println("Walls = " + walls);

    }

    static void CollectCoin(String[][] matrix) {
        if(matrix[currentRow][currentCol].equals("$")){
            coins++;
        }
    }

    static boolean ValidMove(String[][] matrix, int row, int col) {
        if ((row >= 0 && row < matrix.length) && (col >= 0 && col < matrix[row].length)) {
            return true;
        }
        return false;
    }

}
