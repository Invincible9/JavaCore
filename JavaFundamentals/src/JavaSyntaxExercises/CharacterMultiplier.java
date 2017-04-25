package JavaSyntaxExercises;

import java.util.Scanner;

/**
 * Created by Mihail on 1/17/2017.
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();

        long multiplySum = 0;
        long remainingSum = 0;

        if (firstWord.length() < secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                multiplySum += (firstWord.charAt(i) * secondWord.charAt(i));
            }
        } else {
            for (int i = 0; i < secondWord.length(); i++) {
                multiplySum += (secondWord.charAt(i) * firstWord.charAt(i));
            }
        }

        if (firstWord.length() > secondWord.length()) {
            String firstLen = firstWord.substring(secondWord.length());
            for (int i = 0; i < firstLen.length(); i++) {
                remainingSum += firstLen.charAt(i);
            }
        } else {
            String secondLen = secondWord.substring(firstWord.length());
            for (int i = 0; i < secondLen.length(); i++) {
                remainingSum += secondLen.charAt(i);
            }
        }

        long finalSum = multiplySum + remainingSum;

        System.out.println(finalSum);
    }
}
