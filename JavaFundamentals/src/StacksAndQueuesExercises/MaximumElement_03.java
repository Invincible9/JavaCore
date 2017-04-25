package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Mihail on 3/15/2017.
 */
public class MaximumElement_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCommands = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> sortedStack = new ArrayDeque<>();

        while (numberOfCommands-- > 0) {
            String[] info = reader.readLine().split("\\s+");

            switch (info[0]) {
                case "1":
                    int element = Integer.parseInt(info[1]);
                    stack.push(element);

                    if (!sortedStack.isEmpty() && sortedStack.peek() >= element) {
                        sortedStack.addLast(element);
                    } else {
                        sortedStack.push(element);
                    }
                    break;
                case "2":
                    if(!stack.isEmpty()) {
                        sortedStack.remove(stack.peek());
                        stack.pop();
                    }
                    break;
                case "3":
                    System.out.println(sortedStack.peek());
                    break;
                default:
                    break;
            }

        }

    }
}
