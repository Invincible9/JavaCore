package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mihail on 1/27/2017.
 */
public class MaxSequenceInMatrix {

    private static long SEQUENCE_COUNT = 0;
    private static String SEQUENCE_SYMBOL = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matrixSize = input.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] lines = input.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = lines[j];
            }
        }

        List<String> sequence = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            sequence.addAll(Arrays.asList(matrix[i]));
            checkForSequence(sequence);
        }

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                sequence.add(matrix[row][col]);
            }
            checkForSequence(sequence);
        }

        int minSize = Math.min(rows, cols);
        for (int i = 0; i < minSize; i++) {
            sequence.add(matrix[i][i]);
        }
        checkForSequence(sequence);

//        for (int i = 0; i < minSize; i++) {
//            sequence.add(matrix[i][matrix.length - 1 - i]);
//        }
//        checkForSequence(sequence);


        for (int i = 0; i < SEQUENCE_COUNT; i++) {
            System.out.printf("%s, ", SEQUENCE_SYMBOL);
        }

    }

    private static void checkForSequence(List<String> sequence) {

        for (int startPos = 0; startPos < sequence.size() - 1; startPos++) {

            String currentEl = sequence.get(startPos);
            int nextElPos = startPos + 1;
            long count = 1;

            while (currentEl.equals(sequence.get(nextElPos))) {
                count++;

                if (count >= SEQUENCE_COUNT) {
                    SEQUENCE_COUNT = count;
                    SEQUENCE_SYMBOL = currentEl;
                }

                nextElPos++;

                if (nextElPos >= sequence.size()) {
                    break;
                }
            }
        }

        sequence.clear();
    }

}
