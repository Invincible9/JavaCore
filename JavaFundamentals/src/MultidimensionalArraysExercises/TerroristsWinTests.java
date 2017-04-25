package MultidimensionalArraysExercises;

import javafx.beans.property.StringPropertyBase;

import java.util.Scanner;

/**
 * Created by Mihail on 2/6/2017.
 */
public class TerroristsWinTests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String info = input.nextLine();

        String result = foundBomb(info);

        System.out.println(result);

    }

    public static String  foundBomb(String info){

        int firstIndex = info.indexOf("|");
        String fromFirstInd = info.substring(firstIndex + 1);
        int secondIndex = fromFirstInd.indexOf("|");
        String searchingText = fromFirstInd.substring(0, secondIndex);

        long bombPower = 0;
        for (int i = 0; i < searchingText.length(); i++) {
            bombPower += searchingText.charAt(i);
        }

        String exp = String.valueOf(bombPower);
        int explRange = exp.length()-1;

        int leftIndex = info.indexOf("|");
        String leftSide = info.substring(0, leftIndex - explRange);

        int rightIndex = info.lastIndexOf("|");
        String rightSide = info.substring((rightIndex + 1) + explRange);

        String bombs = info.substring(leftIndex-explRange, (rightIndex + 1) + explRange);

        String destrBombs = "";
        for (int i = 0; i < bombs.length(); i++) {
            destrBombs += ".";
        }

        String cleanBombs = leftSide.concat(destrBombs);

        String result = cleanBombs.concat(rightSide);

        return result;
    }


}
