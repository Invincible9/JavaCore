package DefiningClassesExercises_Lection3.PokemonTrainer_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        String infoPokemons =  reader.readLine();

        while (!infoPokemons.equals("Tournament")) {
            String[] pokemonTokens = infoPokemons.split("\\s+");

            String trainerName = pokemonTokens[0];
            String pokemonName = pokemonTokens[1];
            String pokemonElement = pokemonTokens[2];
            Integer pokemonHealth = Integer.valueOf(pokemonTokens[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer.addPokemon(pokemon);

            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).addPokemon(pokemon);
            } else {
                trainers.put(trainerName, trainer);
            }

            infoPokemons = reader.readLine();
        }

        while (true) {
            String element = reader.readLine();

            if(element.equals("End")) break;

            for (String s : trainers.keySet()) {
                if (trainers.get(s).checkForElement(element)) {
                    trainers.get(s).adBadge();
                } else {
                    trainers.get(s).increaseHealth();
                }
            }

        }

        trainers.entrySet().stream().sorted((t1, t2) -> {
            return Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges());
        }).forEach(trainer -> System.out.println(trainer.getValue()));
    }

}
