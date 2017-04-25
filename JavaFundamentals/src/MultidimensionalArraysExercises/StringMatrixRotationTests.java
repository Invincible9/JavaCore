package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mihail on 2/14/2017.
 */
public class StringMatrixRotationTests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rotate = sc.nextLine();

        int firstIndex = rotate.indexOf("(");
        int lastIndex = rotate.indexOf(")");
        String info = rotate.substring(firstIndex + 1, lastIndex);
        int degrees = Integer.parseInt(info);

        String text = sc.nextLine();

        List<List<String>> matrixHoriz = new ArrayList<>();

        int longestWord = 0;

        while (!text.equals("END")) {
            List<String> line = new ArrayList<>();

            for (int i = 0; i < text.length(); i++) {
                line.add(String.valueOf(text.charAt(i)));
            }

            matrixHoriz.add(line);

            if (longestWord <= text.length()) {
                longestWord = text.length();
            }

            text = sc.nextLine();
        }

        for (int i = 0; i < matrixHoriz.size(); i++) {
            for (int j = 0; j < matrixHoriz.get(i).size(); j++) {
                if (matrixHoriz.get(i).size() < longestWord) {
                    for (int k = 0; k <= (longestWord - matrixHoriz.get(i).size()); k++) {
                        matrixHoriz.get(i).add(" ");
                    }
                }
            }
        }

        String[][] matrixVert = new String[longestWord][matrixHoriz.size()];

        for (int row = 0; row < longestWord; row++) {
            for (int col = 0; col < matrixHoriz.size(); col++) {
                matrixVert[row][col] = matrixHoriz.get(col).get(row);
            }
        }

        // 90 degrees
        if (degrees == 90 || degrees % 360 == 90) {
            for (int i = 0; i < matrixVert.length; i++) {
                for (int j = matrixVert[i].length - 1; j >= 0; j--) {
                    System.out.print(matrixVert[i][j]);
                }
                System.out.println();
            }
        }

        // 180 degrees
        if (degrees == 180 || degrees % 360 == 180) {
            for (int i = matrixHoriz.size() - 1; i >= 0; i--) {
                for (int j = matrixHoriz.get(i).size() - 1; j >= 0; j--) {
                    System.out.print(matrixHoriz.get(i).get(j));
                }
                System.out.println();
            }
        }

        // 270 degrees
        if (degrees == 270 || degrees % 360 == 270) {
            for (int i = matrixVert.length - 1; i >= 0; i--) {
                for (int j = 0; j < matrixVert[i].length; j++) {
                    System.out.print(matrixVert[i][j]);
                }
                System.out.println();
            }
        }

        // 0 or 360 degrees
        if (degrees == 0 || degrees % 360 == 0) {
            for (List<String> strings : matrixHoriz) {
                for (String string : strings) {
                    System.out.print(string);
                }
                System.out.println();
            }
        }


    }
}
