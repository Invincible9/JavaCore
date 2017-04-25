package Polymorphism_Exercises_Lection_07.WildFarm_03;

import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Animal;
import Polymorphism_Exercises_Lection_07.WildFarm_03.abstraction.Food;
import Polymorphism_Exercises_Lection_07.WildFarm_03.animals.Cat;
import Polymorphism_Exercises_Lection_07.WildFarm_03.animals.Mouse;
import Polymorphism_Exercises_Lection_07.WildFarm_03.animals.Tiger;
import Polymorphism_Exercises_Lection_07.WildFarm_03.animals.Zebra;
import Polymorphism_Exercises_Lection_07.WildFarm_03.food.Meat;
import Polymorphism_Exercises_Lection_07.WildFarm_03.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();


        while (!info.equals("End")) {
            String[] animalInfo = info.split("\\s+");

            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];

            Animal animal = null;

            try {
                switch (animalInfo[0].toLowerCase()) {
                    case "cat":
                        String catBreed = animalInfo[4];
                        animal = new Cat(animalName, animalWeight, animalLivingRegion, catBreed);
                        break;
                    case "tiger":
                        animal = new Tiger(animalName, animalWeight, animalLivingRegion);
                        break;
                    case "zebra":
                        animal = new Zebra(animalName, animalWeight, animalLivingRegion);
                        break;
                    case "mouse":
                        animal = new Mouse(animalName, animalWeight, animalLivingRegion);
                        break;
                    default:
                        break;
                }
            }catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            String[] foodType = info.split("\\s+");

            Food food = null;

            switch (foodType[0].toLowerCase()) {
                case "vegetable":
                    food = new Vegetable(Integer.parseInt(foodType[1]));
                    break;
                case "meat":
                    food = new Meat(Integer.parseInt(foodType[1]));
                    break;
            }

            animal.makeSound();
            animal.eat(food);

            System.out.println(animal.toString());

            info = reader.readLine();
        }





    }
}
