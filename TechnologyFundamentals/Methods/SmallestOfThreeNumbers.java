package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        findMinElement(firstNumber, secondNumber, thirdNumber);
    }

    public static void findMinElement(int first, int second, int third){
        System.out.println(Math.min(third, Math.min(first, second)));
    }
}
