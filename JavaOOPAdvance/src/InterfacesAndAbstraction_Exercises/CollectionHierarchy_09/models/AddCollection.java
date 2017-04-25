package InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models;


import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IAddCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/19/2017.
 */
public class AddCollection implements IAddCollection {

    private List<String> list;

    public AddCollection() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(String element) {
        this.list.add(element);
    }

    @Override
    public void printElements(){
        for (int i = 0; i < this.list.size(); i++) {
            System.out.print(i + " ");
        }
    }

}
