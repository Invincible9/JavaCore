import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        LinkedHashMap<String, Integer> dwarfs =
                new LinkedHashMap<>();

        LinkedHashMap<String, Integer> colors =
                new LinkedHashMap<>();

        String input = "";

        while (!"Once upon a time".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+<:>\\s+");

            String name = data[0];
            String color = data[1];
            int physics = Integer.parseInt(data[2]);
            String nameWithColor = name + "<:>" + color;

            if (!dwarfs.containsKey(nameWithColor)) {
                dwarfs.put(nameWithColor, physics);
                if (!colors.containsKey(color)) {
                    colors.put(color, 1);
                } else {
                    colors.put(color, colors.get(color) + 1);
                }
            } else {
                if (dwarfs.get(nameWithColor) < physics) {
                    dwarfs.put(nameWithColor, physics);
                }
            }
        }

        dwarfs.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = e2.getValue().compareTo(e1.getValue());

                    if (sort == 0) {
                        String color1 = e1.getKey().split("<:>")[1];
                        String color2 = e2.getKey().split("<:>")[1];

                        int count1 = colors.get(color1);
                        int count2 = colors.get(color2);
                        sort = Integer.compare(count2, count1);
                    }
                    return sort;
                })
                .forEach(d -> {
                    System.out.println(String.format(
                            "(%s) %s <-> %d", d.getKey().split("<:>")[1],
                            d.getKey().split("<:>")[0],
                            d.getValue()
                    ));
                });


    }
}
