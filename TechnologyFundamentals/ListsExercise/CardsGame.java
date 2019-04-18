package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> first = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> second = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true){

            if(first.get(0) > second.get(0)){
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            }else if(first.get(0) < second.get(0)){
                second.add(second.get(0));
                second.add(first.get(0));
                second.remove(0);
                first.remove(0);
            }else if(first.get(0).equals(second.get(0))){
                first.remove(0);
                second.remove(0);
            }

            if(first.size() == 0){
                System.out.printf("First player wins! Sum: %d\n", second.stream().mapToInt(Integer::valueOf).sum());
                break;
            }else if(second.size() == 0){
                System.out.printf("Second player wins! Sum: %d\n", first.stream().mapToInt(Integer::valueOf).sum());
                break;
            }
        }




    }
}
