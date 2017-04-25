package Polymorphism_Exercises_Lection_07.WildFarm_03.animals;

import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Food;
import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Mammal;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/9/2017.
 */
public class Zebra extends Mammal {

    private static final String ANIMAL_TYPE = "Zebra";

    public Zebra(String animalName, double animalWeight, String animalLivingRegion) {
        super(animalName, ANIMAL_TYPE, animalWeight, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(food.getClass().getSimpleName().equals("vegetable")){
            super.setFootEaten(food.getQuantity());
        }else{
            throw new IllegalArgumentException(String.format("%s are not eating that type of food!", super.getAnimalType()));
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("#.################");

        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), decimal.format(super.getAnimalWeight()),
                super.getAnimalLivingRegion(), super.getFootEaten());
    }
}
