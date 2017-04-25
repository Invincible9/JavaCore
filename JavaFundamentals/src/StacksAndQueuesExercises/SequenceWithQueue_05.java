package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/29/2017.
 */
public class SequenceWithQueue_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());

        ArrayDeque<Long> queue = new ArrayDeque<>();
        queue.add(n);

        for (int i = 0; i < 50; i++) {

            Long element = queue.poll();
            System.out.printf("%d ", element);

            Long s2 = element + 1;
            Long s3 = 2 * element + 1;
            Long s4 = element + 2;

            queue.addLast(s2);
            queue.addLast(s3);
            queue.addLast(s4);
        }

    }
}
