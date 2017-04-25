package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

/**
 * Created by Mihail on 3/14/2017.
 */
public class MathPotato_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, names);

        int counter = 1;
        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }

            if (isPrime(counter)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            counter++;
        }

        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int counter) {
        if (counter <= 1) {
            return false;
        }

        for (int divide = 2; divide <= Math.sqrt(counter); divide++) {
            if (counter % divide == 0) {
                return false;
            }
        }

        return true;
    }

}
