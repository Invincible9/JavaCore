package MultidimensionalArraysExercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Mihail on 2/2/2017.
 */
public class CollectCoins1 {
    static int _currRow = 0;
    static int _currCol = 0;
    static int _coins = 0;
    static int _wallHits = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] field = new String[4][];
        GetInputs(field);
        String moves = input.nextLine();
        DoMoves(moves, field);
        PrintResult();
    }

    static void DoMoves(String moves, String[][] field) {
//        CollectCoin(field); // if there's a coin on {0, 0}
        for (char move : moves.toCharArray()) {
            switch (move) {
                case '>':
                    PerformMove(field, _currRow, _currCol + 1);
                    break;
                case '<':
                    PerformMove(field, _currRow, _currCol - 1);
                    break;
                case '^':
                    PerformMove(field, _currRow - 1, _currCol);
                    break;
                case 'V':
                    PerformMove(field, _currRow + 1, _currCol);
                    break;
            }
        }
    }

    static void PerformMove(String[][] field, int row, int col) {
        if (ValidMove(field, row, col)) {
            _currCol = col;
            _currRow = row;
            CollectCoin(field);
        } else {
            _wallHits++;
        }
    }

    static void PrintResult() {
        System.out.printf("Coins = %d", _coins);
        System.out.println();
        System.out.printf("Walls = %d", _wallHits);
    }

    static void CollectCoin(String[][] field) {
        if (field[_currRow][_currCol].equals("$")) {
            _coins++;
        }
    }

    static boolean ValidMove(String[][] field, int row, int col) {
        if ((row >= 0 && row < field.length) && (col >= 0 && col < field[row].length)) {
            return true;
        }
        return false;
    }

    static void GetInputs(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            field[i] = input.nextLine().split("");
        }
    }

}

