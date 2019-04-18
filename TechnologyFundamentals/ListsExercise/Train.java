package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] inputData = reader.readLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputData.length; i++) {
            numbers.add(Integer.parseInt(inputData[i]));
        }

        int capacity = Integer.parseInt(reader.readLine());

        String input = reader.readLine();

        while (!"end".equals(input)){
            String[] data = input.split("\\s+");

            if(data.length == 2){
                numbers.add(Integer.parseInt(data[1]));
            }else{
                int element = Integer.parseInt(data[0]);

                for (int i = 0; i < numbers.size(); i++) {
                    if(element + numbers.get(i) <= capacity){
                        numbers.set(i, element + numbers.get(i));
                        break;
                    }
                }
            }

            input = reader.readLine();
        }

        System.out.println(
                numbers
                .toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
