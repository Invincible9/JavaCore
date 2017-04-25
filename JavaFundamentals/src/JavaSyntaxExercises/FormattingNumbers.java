package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.printf("|%1$-10s|", Integer.toHexString(a).toUpperCase());
        System.out.printf("%010d|", Integer.parseInt(Integer.toBinaryString(a)));
        System.out.printf("%1$10s|", String.format("%.2f", b));
        System.out.printf("%1$-10s|", String.format("%.3f", c));
        System.out.println();
    }
}