import java.util.Scanner;

/**
 * Created by Mihail on 2/5/2017.
 */
public class IncreasingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int[] numbers = new int[n];

        int maxCount = 1;

        for (int startPos = 0; startPos < numbers.length; startPos++) {
            numbers[startPos] = Integer.parseInt(input.nextLine());
        }

        for (int startPos = 0; startPos < numbers.length - 1; startPos++) {

            int secondNumPos = startPos + 1;

            int count = 1;

            while (numbers[startPos] < numbers[secondNumPos]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }

                startPos++;
                secondNumPos++;

                if (secondNumPos >= numbers.length) {
                    break;
                }
            }
        }

        System.out.println(maxCount);
    }
}
