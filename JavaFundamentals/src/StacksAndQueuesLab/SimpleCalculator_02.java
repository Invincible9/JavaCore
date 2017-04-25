package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

/**
 * Created by Mihail on 3/13/2017.
 */
public class SimpleCalculator_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = reader.readLine().split("\\s+");

        ArrayDeque<String> deque = new ArrayDeque<>();
        Collections.addAll(deque, tokens);

        while (deque.size() > 1) {
            int firstNumber = Integer.parseInt(deque.pop());
            String sign = deque.pop();
            int secondNumber = Integer.parseInt(deque.pop());

            if (sign.equals("+")) {
                deque.push(String.valueOf(firstNumber + secondNumber));
            } else {
                deque.push(String.valueOf(firstNumber - secondNumber));
            }
        }
        System.out.println(deque.pop());
    }
}
