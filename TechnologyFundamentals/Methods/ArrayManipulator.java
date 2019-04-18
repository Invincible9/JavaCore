package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] inputData = reader.readLine().split("\\s+");

        int[] numbers = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            numbers[i] = Integer.parseInt(inputData[i]);
        }

        String input = "";

        while (!"end".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "exchange":
                    exchange(numbers, Integer.parseInt(data[1]));
                    break;
                case "max":
                    int indexMax = max(numbers, data[1]);
                    if(indexMax == -1){
                        System.out.println("No matches");
                    }else{
                        System.out.println(indexMax);
                    }
                    break;
                case "min":
                    int indexMin = min(numbers, data[1]);
                    if(indexMin == -1){
                        System.out.println("No matches");
                    }else{
                        System.out.println(indexMin);
                    }
                    break;
                case "first":
                    firstOrLast(numbers, Integer.parseInt(data[1]), data[2], "first");
                    break;
                case "last":
                    firstOrLast(numbers, Integer.parseInt(data[1]), data[2], "last");
                    break;
            }

        }

        System.out.println(Arrays.toString(numbers));

    }

    public static void firstOrLast(int[] numbers, int count, String command, String condition){
        int type = command.equals("even") ? 0 : 1;

        if(count < 0 || count > numbers.length){
            System.out.println("Invalid count");
            return;
        }

        int[] result = fillElementsByCriteria(numbers, type);

        if(result.length == 0){
            System.out.println("[]");
        }else{
            String output = "[";
            int countElements = Math.min(result.length, count);

            if(condition.equals("first")) {

                for (int i = 0; i < countElements; i++) {
                    if (i < countElements - 1) {
                        output += result[i] + ", ";
                    } else {
                        output += result[i] + "]";
                    }
                }
            }else{
                int index = 0;
                for (int i = 0; i < countElements; i++) {
                    if(i < countElements - 1) {
                        output += result[result.length - countElements + index++] + ", ";
                    }else{
                        output += result[result.length - countElements + index++] + "]";
                    }
                }
            }
            System.out.println(output);
        }
    }

    public static int min(int[] numbers, String command) {
        int type = command.equals("even") ? 0 : 1;

        int index = -1;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == type){
                if(numbers[i] <= minElement){
                    minElement = numbers[i];
                    index = i;
                }
            }
        }

        return index;
    }


    public static int max(int[] numbers, String command) {
        int type = command.equals("even") ? 0 : 1;

        int index = -1;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == type){
                if(numbers[i] >= maxElement){
                    maxElement = numbers[i];
                    index = i;
                }
            }
        }

        return index;
    }

    private static int[] fillElementsByCriteria(int[] numbers, int type) {
        int index = 0;
        int[] result = new int[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == type) {
                if (index == result.length) {
                    result = changeSizeArray(result);
                }
                result[index++] = numbers[i];
            }
        }
        return result;
    }

    private static int[] changeSizeArray(int[] result) {
        int[] newArray = new int[result.length + 1];
        int count = 0;

        for (int i = 0; i < result.length; i++) {
            newArray[count++] = result[i];
        }

        return newArray;
    }


    public static void exchange(int[] numbers, int index) {
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index");
            return;
        }

        int[] result = new int[numbers.length];
        int count = 0;

        for (int i = index + 1; i < numbers.length; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i <= index; i++) {
            result[count++] = numbers[i];
        }

        for (int i = 0; i < result.length; i++) {
            numbers[i] = result[i];
        }
    }
}