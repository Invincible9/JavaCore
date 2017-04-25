package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 4/5/2017.
 */
public class StackFibonacci_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.parseLong(reader.readLine());
        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.add((long) 1);
        fibonacci.add((long) 1);

        for (int i = 1; i < number; i++) {
            long x = fibonacci.pop();
            long y = fibonacci.pop();
            long z = x + y;
            fibonacci.push(y);
            fibonacci.push(x);
            fibonacci.push(z);
        }
        System.out.println(fibonacci.pop());
    }
}
