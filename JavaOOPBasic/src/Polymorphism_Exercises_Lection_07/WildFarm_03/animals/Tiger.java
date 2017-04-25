package Polymorphism_Exercises_Lection_07.WildFarm_03.animals;

import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Felime;
import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Food;

import java.text.DecimalFormat;

/**
 * Created by Mihail on 3/9/2017.
 */
public class Tiger extends Felime {

    private static final String ANIMAL_TYPE = "Tiger";

    public Tiger(String animalName, double animalWeight, String animalLivingRegion) {
        super(animalName, ANIMAL_TYPE, animalWeight, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if(!(food.getClass().getSimpleName()).equals("vegetable")){
            this.setFootEaten(food.getQuantity());
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
