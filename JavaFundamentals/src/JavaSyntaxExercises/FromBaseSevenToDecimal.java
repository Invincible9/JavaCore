package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class FromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number = input.next();
        System.out.print(Integer.valueOf(number, 7));
    }
}
