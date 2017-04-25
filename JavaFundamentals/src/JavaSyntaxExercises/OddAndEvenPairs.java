package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] num = input.nextLine().split(" ");
        int[] numbers = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            numbers[i] = Integer.parseInt(num[i]);
        }

        if (num.length % 2 == 1) {
            System.out.println("invalid length");
        } else {
            for (int i = 0; i < numbers.length; i += 2) {
                if ((numbers[i] % 2 == 0) && (numbers[i + 1] % 2 == 0)) {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> " + "both are even");
                } else if ((numbers[i] % 2 == 1) && (numbers[i + 1] % 2 == 1)) {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> " + "both are odd");
                } else {
                    System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> " + "different");
                }
            }
        }
    }
}
