package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ax = input.nextInt();
        int Ay = input.nextInt();
        input.nextLine();

        int Bx = input.nextInt();
        int By = input.nextInt();
        input.nextLine();

        int Cx = input.nextInt();
        int Cy = input.nextInt();
        input.nextLine();

        double area = (Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2;

        System.out.println(Math.round(Math.abs(area)));
    }
}
