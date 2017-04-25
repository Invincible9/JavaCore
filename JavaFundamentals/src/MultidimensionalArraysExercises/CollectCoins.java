package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mihail on 2/2/2017.
 */
public class CollectCoins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] board = new String[4][];

        String boardLine = "";
        for (int row = 0; row < board.length; row++) {
            board[row] = input.nextLine().split("");
        }

        int currentRow = 0;
        int currentCol = 0;
        int coinsCount = 0;
        int wallHitsCount = 0;

        String movementCommands = input.nextLine();

        for (char currentDirection : movementCommands.toCharArray()) {
            if (currentDirection == 'V') {
                currentRow++;
                if (currentRow >= board.length) {
                    currentRow--;
                    wallHitsCount++;
                    continue;
                } else if (currentCol >= board[currentRow].length) {
                    currentRow--;
                    wallHitsCount++;
                    continue;
                }
            } else if (currentDirection == '>') {
                currentCol++;
                if (currentCol >= board[currentRow].length) {
                    currentCol--;
                    wallHitsCount++;
                    continue;
                }
            } else if (currentDirection == '<') {
                currentCol--;
                if (currentCol < 0) {
                    currentCol++;
                    wallHitsCount++;
                    continue;
                }
            } else if (currentDirection == '^') {
                currentRow--;
                if (currentRow < 0) {
                    currentRow++;
                    wallHitsCount++;
                    continue;
                } else if (currentCol >= board[currentRow].length) {
                    currentRow++;
                    wallHitsCount++;
                    continue;
                }
            }

            if (board[currentRow][currentCol].equals("$")) {
                coinsCount++;
            }
        }
        System.out.printf("Coins = %d", coinsCount);
        System.out.println();
        System.out.printf("Walls = %d", wallHitsCount);
    }

}
