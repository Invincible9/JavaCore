package Inheritance_Lab_Lection_06.FragileBaseClass_04;

import java.util.Collections;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Predator extends Animal {

    private int health;

    public void feed(Food food){
        super.eat(food);
        this.health++;
    }

    public void feedAll(Food[] foods){
        Collections.addAll(super.foodEaten, foods);
        this.health++;
    }

}
