package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/22/2017.
 */
public class BasicQueueOperations_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] queueOperation = reader.readLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int numberOfElements = Integer.parseInt(queueOperation[0]);
        int numberOfDeque = Integer.parseInt(queueOperation[1]);
        int searchingElement = Integer.parseInt(queueOperation[2]);

        String[] elements = reader.readLine().split("\\s+");
        for (int i = 0; i < numberOfElements; i++) {
            queue.add(Integer.parseInt(elements[i]));
        }

        for (int i = 0; i < numberOfDeque; i++) {
            queue.remove();
        }

        if (queue.contains(searchingElement)) {
            System.out.println(true);
        } else if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            int minEl = Integer.MAX_VALUE;

            for (Integer integer : queue) {
                if (integer < minEl) {
                    minEl = integer;
                }
            }
            System.out.println(minEl);
        }

    }
}
