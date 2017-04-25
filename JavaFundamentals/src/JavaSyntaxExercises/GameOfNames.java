package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/19/2017.
 */
public class GameOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long maxSum = Long.MIN_VALUE;
        String winPlayer = "";

        for (int i = 0; i < n; i++) {
            String name = input.next();
            long points = input.nextInt();

            long sum = 0;

            sum += points;

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) % 2 == 0) {
                    sum += name.charAt(j);
                } else {
                    sum -= name.charAt(j);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                winPlayer = name;
            }

        }
        System.out.printf("The winner is %s - %d points", winPlayer, maxSum);
    }
}
