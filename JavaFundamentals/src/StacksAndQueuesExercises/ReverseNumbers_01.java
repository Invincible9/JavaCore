package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 3/15/2017.
 */
public class ReverseNumbers_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.valueOf(number));
        }

        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                System.out.println(stack.pop());
            } else {
                System.out.print(stack.pop() + " ");
            }
        }
    }

}
