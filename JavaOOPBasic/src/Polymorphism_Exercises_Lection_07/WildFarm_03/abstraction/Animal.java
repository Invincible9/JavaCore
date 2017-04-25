package Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction;

/**
 * Created by Mihail on 3/9/2017.
 */
public abstract class Animal {

    private String animalName;
    private String animalType;
    private double animalWeight;
    private String animalLivingRegion;
    private int footEaten;

    public Animal(String animalName, String animalType, double animalWeight, String animalLivingRegion) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.animalLivingRegion = animalLivingRegion;
        this.footEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public String getAnimalLivingRegion() {
        return animalLivingRegion;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);

    public String getAnimalType() {
        return animalType;
    }

    public int getFootEaten() {
        return footEaten;
    }

    public void setFootEaten(int footEaten) {
        this.footEaten = footEaten;
    }


}
