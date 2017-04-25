package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/13/2017.
 */
public class DecimalToBinary_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.parseLong(reader.readLine());

        if (number == 0) {
            System.out.println(0);
        } else {
            ArrayDeque<Long> deque = new ArrayDeque<>();

            while (number != 0) {
                deque.push(number % 2);
                number /= 2;
            }

            while (!deque.isEmpty()) {
                System.out.print(deque.pop());
            }
        }

    }
}
