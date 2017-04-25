package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mihail on 1/18/2017.
 */
public class FirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[] numbers = Arrays.stream(input.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        String command0 = input.next();
        long number = input.nextInt();
        String kindEl = input.next();


        if (kindEl.equals("odd")) {
            for (long num : Arrays.stream(numbers).filter(x -> x % 2 != 0).limit(number).toArray()) {
                System.out.print(num + " ");
            }
        }else {
            for (long num : Arrays.stream(numbers).filter(x -> x % 2 == 0).limit(number).toArray()) {
                System.out.print(num + " ");
            }
        }

    }
}
