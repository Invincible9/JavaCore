import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int sizeArray = Integer.parseInt(reader.readLine());
        int[] ladybugs = new int[sizeArray];

        int[] indices = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(e -> e >= 0 && e < sizeArray)
                .toArray();

        for (int i = 0; i < indices.length; i++) {
            ladybugs[indices[i]] = 1;
        }

        String input = "";

        while (!"end".equals(input = reader.readLine())){
            String[] data = input.split("\\s+");

            int ladybugIndex = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if(ladybugIndex >= 0 && ladybugIndex < sizeArray &&
            ladybugs[ladybugIndex] == 1){
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

        System.out.println(Arrays.toString(ladybugs).replaceAll("[\\[\\],]", ""));

    }

}
