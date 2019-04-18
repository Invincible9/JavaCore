import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Integer> numbers =
                Arrays.stream(reader.readLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0){
            int index = Integer.parseInt(reader.readLine());

            int element = 0;
            if(index < 0){
                element = numbers.get(numbers.size() - 1);
                numbers.set(0, element);
            }else if(index >= numbers.size()){
                element = numbers.get(0);
                numbers.set(numbers.size() - 1, element);
            }else{
                element = numbers.remove(index);
            }

            sum += element;
            increaseOrDecreaseElements(numbers, element);
        }

        System.out.println(sum);
    }

    private static void increaseOrDecreaseElements(List<Integer> numbers, int element) {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) <= element){
                numbers.set(i, numbers.get(i) + element);
            }else{
                numbers.set(i, numbers.get(i) - element);
            }
        }
    }
}
