import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Presentation {

    static class Animal {
        private String animalName;
        private Long dailyFoodLimit;

        public Animal(String animalName, Long dailyFoodLimit) {
            this.animalName = animalName;
            this.dailyFoodLimit = dailyFoodLimit;
        }

        public String getAnimalName() {
            return animalName;
        }

        public Long getDailyFoodLimit() {
            return dailyFoodLimit;
        }

        public void setAnimalName(String animalName) {
            this.animalName = animalName;
        }

        public void setDailyFoodLimit(Long dailyFoodLimit) {
            this.dailyFoodLimit = dailyFoodLimit;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String input = "";

        LinkedHashMap<String, List<Animal>> animals =
                new LinkedHashMap<>();

        while (!"Last Info".equals(input = reader.readLine())) {
            String[] data = input.split(":");

            String command = data[0];

            if (!animals.containsKey(data[3])) {
                animals.put(data[3], new ArrayList<>());
            }

            switch (command) {
                case "Add":
                    if (animals.get(data[3]).stream().anyMatch(e ->
                            e.getAnimalName().equals(data[1]))) {
                        animals.get(data[3]).forEach(e -> {
                            if (e.getAnimalName().equals(data[1])) {
                                e.setDailyFoodLimit(e.getDailyFoodLimit() +
                                        Long.parseLong(data[2]));
                            }
                        });
                    } else {
                        Animal animal = new Animal(data[1], Long.parseLong(data[2]));
                        animals.get(data[3]).add(animal);
                    }
                    break;
                case "Feed":
                    animals.get(data[3]).forEach(e -> {
                        if (e.getAnimalName().equals(data[1])) {
                            e.setDailyFoodLimit(e.getDailyFoodLimit() -
                                    Long.parseLong(data[2]));
                            if (e.getDailyFoodLimit() <= 0) {
                                System.out.println(
                                        String.format(
                                                "%s was successfully fed", data[1]
                                        )
                                );
                            }
                        }
                    });
                    break;
            }
        }

        System.out.println("Animals:");

        animals = animals.entrySet().stream().filter(e -> e.getValue()
                .stream().anyMatch(a -> a.getDailyFoodLimit() > 0))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (k, v) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

        List<Animal> animalList = new ArrayList<>();

        animals.forEach((key, value) -> {
            animalList.addAll(value);
        });

        animalList.stream()
                .filter(e -> e.getDailyFoodLimit() > 0)
                .sorted((e1, e2) -> {
                    int sort = Long.compare(e2.getDailyFoodLimit(), e1.getDailyFoodLimit());

                    if (sort == 0) {
                        sort = e1.getAnimalName().compareTo(e2.getAnimalName());
                    }
                    return sort;
                }).forEach(e -> {
            System.out.println(
                    String.format("%s -> %dg", e.getAnimalName(),
                            e.getDailyFoodLimit())
            );
        });

        System.out.println("Areas with hungry animals:");
        animals.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(),
                        e1.getValue().size()))
                .forEach(e -> {

                    System.out.println(String.format(
                            "%s : %d", e.getKey(),
                            (int) e.getValue()
                                    .stream()
                                    .filter(v -> v.getDailyFoodLimit() > 0).count()
                    ));
                });

    }
}
