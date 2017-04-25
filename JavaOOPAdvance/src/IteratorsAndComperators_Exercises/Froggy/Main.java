package IteratorsAndComperators_Exercises.Froggy;

import IteratorsAndComperators_Exercises.Froggy_GitHub.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 3/25/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(scan.readLine().split(", |\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        scan.readLine();

        Iterable<Integer> lake = new Lake(numbers);
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : lake) {
            stringBuilder.append(integer).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);

        System.out.println(stringBuilder);
    }
}
