package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/13/2017.
 */
public class MatchingBrackets_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String expression = reader.readLine();

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (symbol == '(') {
                deque.push(i);
            } else if (symbol == ')') {
                int startIndex = deque.pop();
                String searchingText = expression.substring(startIndex, i + 1);
                System.out.println(searchingText);
            }
        }
    }
}
