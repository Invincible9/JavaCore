package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
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

        while (!"end".equals(input = reader.readLine())){

            String[] data = input.split("\\s+");
            String command = data[0];

            List<String> arr = new ArrayList<>();

            switch (command) {
                case "exchange":
                    exchangeArray(numbers, Integer.parseInt(data[1]));
                    break;
                case "min":
                    findMinElementIndex(numbers, data[1]);
                    break;
                case "max":
                    findMaxElementIndex(numbers, data[1]);
                    break;
                case "first":
                    findFirstCountElements(numbers, Integer.parseInt(data[1]), data[2]);
                    break;
                case "last":
                    findLastCountElements(numbers, Integer.parseInt(data[1]), data[2]);
                    break;

            }
        }

        System.out.println(Arrays.toString(numbers));

    }

    private static void findLastCountElements(int[] numbers, int count, String type) {
        if(count < 0 || count > numbers.length){
            System.out.println("Invalid count");
            return;
        }

        int num = type.equals("even") ? 0 : 1;

        int[] result = fillElementsByCriteria(numbers, num);

        if(result.length == 0){
            System.out.println("[]");
        }else{
            int minCount = Math.min(count, result.length);

            int index = 0;
            String output = "[";
            for (int i = 0; i < minCount; i++) {
                if(i < minCount - 1){
                    output += result[result.length - minCount + index++] + ", ";
                }else{
                    output += result[result.length - minCount + index++] + "]";
                }
            }

            System.out.println(output);
        }
    }

    private static void findFirstCountElements(int[] numbers, int count, String type) {
        if(count < 0 || count > numbers.length){
            System.out.println("Invalid count");
            return;
        }

        int num = type.equals("even") ? 0 : 1;

        int[] result = fillElementsByCriteria(numbers, num);

        if(result.length == 0){
            System.out.println("[]");
        }else{
            int minCount = Math.min(count, result.length);

            String output = "[";
            for (int i = 0; i < minCount; i++) {
                if(i < minCount - 1){
                    output += result[i] + ", ";
                }else{
                    output += result[i] + "]";
                }
            }

            System.out.println(output);
        }
    }

    private static int[] fillElementsByCriteria(int[] numbers, int num){

        int[] result = new int[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == num){
                if(index == result.length){
                    result = changeArraySize(result);
                }
                result[index++] = numbers[i];
            }
        }

        return result;
    }

    private static int[] changeArraySize(int[] result) {
        int[] newArray = new int[result.length + 1];

        int index = 0;
        for (int i = 0; i < result.length; i++) {
            newArray[index++] = result[i];
        }

        return newArray;
    }


    private static void findMaxElementIndex(int[] numbers, String type) {
        int number = type.equals("even") ? 0 : 1;
        int minElement = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == number){
                if(numbers[i] >= minElement){
                    minElement = numbers[i];
                    index = i;
                }
            }
        }

        if(index == -1){
            System.out.println("No matches");
        }else{
            System.out.println(index);
        }
    }

    private static void findMinElementIndex(int[] numbers, String type) {
        int number = type.equals("even") ? 0 : 1;
        int minElement = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == number){
                if(numbers[i] <= minElement){
                    minElement = numbers[i];
                    index = i;
                }
            }
        }

        if(index == -1){
            System.out.println("No matches");
        }else{
            System.out.println(index);
        }

    }

    private static void exchangeArray(int[] numbers, int index) {
        if(index < 0 || index >= numbers.length){
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
