package ArraysExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LadyBugs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int fieldSize = Integer.parseInt(reader.readLine());

        int[] ladybugs = new int[fieldSize];

        int[] ladybugIndices = Arrays.stream(reader.readLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e >= 0 && e < fieldSize)
                .toArray();

        for (int i = 0; i < ladybugIndices.length; i++) {
            ladybugs[ladybugIndices[i]] = 1;
        }

        String input = "";

        while (!"end".equals(input = reader.readLine())){
            String[] data = input.split(" ");

            int ladybugIndex = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if(ladybugIndex >= 0 && ladybugIndex < ladybugs.length
             && ladybugs[ladybugIndex] == 1) {
                ladybugs[ladybugIndex] = 0;

                while (true) {
                    switch (direction) {
                        case "left":
                            ladybugIndex -= flyLength;
                            break;
                        case "right":
                            ladybugIndex += flyLength;
                            break;
                    }

                    if(ladybugIndex < 0 || ladybugIndex >= ladybugs.length){
                        break;
                    }

                    if(ladybugs[ladybugIndex] == 1){
                        continue;
                    }

                    if(ladybugs[ladybugIndex] == 0){
                        ladybugs[ladybugIndex] = 1;
                        break;
                    }
                }
            }
        }

        System.out.println(String.join(" ",
                Arrays.stream(ladybugs).mapToObj(String::valueOf)
        .toArray(String[]::new)));
    }
}
