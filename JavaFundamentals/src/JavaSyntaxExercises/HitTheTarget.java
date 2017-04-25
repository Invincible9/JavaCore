package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == n) {
                    System.out.println(i + " + " + j + " = " + n);
                }
            }
        }

        for (int i = 1; i <= 20; i++) {
            for (int j = 20; j >= 1; j--) {
                if (i - j == n) {
                    System.out.println(i + " - " + j + " = " + n);
                }
            }
        }

    }
}
