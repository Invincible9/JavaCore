package Polymorphism_Exercises_Lection_07.WildFarm_03.animals;

import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Felime;
import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Food;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/9/2017.
 */
public class Cat extends Felime {

    private static final String ANIMAL_TYPE = "Cat";

    private String breed;

    public Cat(String animalName, double animalWeight, String animalLivingRegion, String breed) {
        super(animalName, ANIMAL_TYPE, animalWeight, animalLivingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.setFootEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#.################");

        return String.format("%s[%s, %s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), this.breed, decimal.format(super.getAnimalWeight()),
                super.getAnimalLivingRegion(), super.getFootEaten());
    }
}
