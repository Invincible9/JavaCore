package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] firstArray = reader.readLine().split("\\s+");
        String[] secondArray = reader.readLine().split("\\s+");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if(secondArray[i].equals(firstArray[j])){
                    System.out.print(secondArray[i] + " ");
                }
            }
        }



    }
}
