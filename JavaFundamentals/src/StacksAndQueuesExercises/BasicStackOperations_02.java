package StacksAndQueuesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by Mihail on 3/15/2017.
 */
public class BasicStackOperations_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] commmands = reader.readLine().split("\\s+");

        int numberOfElements = Integer.parseInt(commmands[0]);
        int numberOfElementsToDelete = Integer.parseInt(commmands[1]);
        int searchingNumber = Integer.parseInt(commmands[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] numbers = reader.readLine().split("\\s+");

        for (int i = 0; i < numberOfElements; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < numberOfElementsToDelete; i++) {
            stack.pop();
        }

        int minNum = Integer.MAX_VALUE;
        boolean flag = false;
        while (stack.size() > 0) {
            int num = stack.pop();

            if (num == searchingNumber) {
                flag = true;
            } else {
                if(num < minNum){
                    minNum = num;
                }
            }
        }

        if(flag || !stack.isEmpty()){
            System.out.println(true);
        }else{
            if(minNum == 2147483647){
                System.out.println(0);
            }else {
                System.out.println(minNum);
            }
        }

    }
}

