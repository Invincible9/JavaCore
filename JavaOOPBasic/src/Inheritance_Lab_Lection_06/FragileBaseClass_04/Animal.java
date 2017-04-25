package Inheritance_Lab_Lection_06.FragileBaseClass_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mihail on 2/28/2017.
 */
public class Animal {
    protected List<Food> foodEaten;

    public Animal(){
        this.foodEaten = new ArrayList<>();
    }

    public final void eat(Food food){
        this.foodEaten.add(food);
    }

    public void eatAll(Food[] foods){
        Collections.addAll(this.foodEaten, foods);
    }

}
