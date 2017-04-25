package EncapsulationExercises_Lection5.ShoppingSpree_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 2/24/2017.
 */
public class Person {
    private String name;
    private double money;
    private List<Product> productList;

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
        this.productList = new ArrayList<>();
    }





}
