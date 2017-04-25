package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/14/2017.
 */
public class PalindromeChecker_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (Character element : text.toCharArray()) {
            queue.offer(element);
        }

        boolean isPalindrome = true;
        while (queue.size() > 1) {

            char firstChar = queue.pollFirst();
            char lastChar = queue.pollLast();

            if (firstChar != lastChar) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }
}
