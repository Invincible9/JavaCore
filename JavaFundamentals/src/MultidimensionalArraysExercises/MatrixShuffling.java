package MultidimensionalArraysExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 2/5/2017.
 */
public class MatrixShuffling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matrixSize = input.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextLine().split(" ");
        }

        String info = input.nextLine();

        String temp = "";

        while (!info.equals("END")) {
            String[] infoSplit = info.split(" ");

            if (infoSplit[0].equals("swap")) {
                int firstRow = Integer.parseInt(infoSplit[1]);
                int firstCol = Integer.parseInt(infoSplit[2]);
                int secondRow = Integer.parseInt(infoSplit[3]);
                int secondCol = Integer.parseInt(infoSplit[4]);

                if ((((firstRow >= 0 && firstRow < matrix.length) && (firstCol >= 0 && firstCol < matrix[firstRow].length))
                        && ((secondRow >= 0 && secondRow < matrix.length) && (secondCol >= 0 && secondCol < matrix[secondRow].length)))) {

                    temp = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = temp;

                    for (String[] s : matrix) {
                        for (String s1 : s) {
                            System.out.print(s1 + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            info = input.nextLine();
        }
    }

}
