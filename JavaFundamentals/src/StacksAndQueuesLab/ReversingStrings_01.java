package StacksAndQueuesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/13/2017.
 */
public class ReversingStrings_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (Character element : info.toCharArray()) {
            deque.push(element);
        }

        while (!deque.isEmpty()) {
            System.out.print(deque.pop());
        }
    }

}
