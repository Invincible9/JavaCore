package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 1/23/2017.
 */
public class ReadSortPrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            lines[i] = input.nextLine();
        }

        for (String line : Arrays.stream(lines).sorted().collect(Collectors.toList())) {
            System.out.println(line);
        }
    }
}
