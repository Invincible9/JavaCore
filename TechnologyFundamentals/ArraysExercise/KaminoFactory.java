package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaminoFactory {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in

                        )
        );

        int sizeArray = Integer.parseInt(reader.readLine());

        int[] numbers = new int[sizeArray];

        String input = "";

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        String bestDNAOutput = "";

        int bestDNA = 0;
        int bestDNARow = 0;

        while (!"Clone them!".equals(input = reader.readLine())){

            String[] elements = input.split("!");

            bestDNA++;
            int count = 0;
            for (int i = 0; i < elements.length; i++) {
                if(!elements[i].equals("")){
                    numbers[count++] = Integer.parseInt(elements[i]);
                }
            }

            int sequenceIndex = 0;
            int countNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
                int currentCount = 0;
                for (int j = i; j < numbers.length; j++) {
                    if(numbers[i] == numbers[j]){
                        currentCount++;
                        if(currentCount > countNumbers){
                            countNumbers = currentCount;
                            sequenceIndex = i;
                        }
                    }else{
                        break;
                    }
                }
            }

            int currentSequenceSum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == 1){
                    currentSequenceSum += numbers[i];
                }
            }

            if(sequenceIndex < bestSequenceIndex || currentSequenceSum > bestSequenceSum){
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = currentSequenceSum;
                bestDNAOutput = "";
                for (int i = 0; i < numbers.length; i++) {
                    if(i < numbers.length - 1) {
                        bestDNAOutput += numbers[i] + " ";
                    }else{
                        bestDNAOutput += numbers[i];
                    }
                }
                bestDNARow = bestDNA;
            }
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestDNARow, bestSequenceSum);
        System.out.println(bestDNAOutput);
    }
}
