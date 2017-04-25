package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstSide = input.nextDouble();
        double secondSide = input.nextDouble();

        System.out.printf("%.2f", (firstSide * secondSide));
    }
}
