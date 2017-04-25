package InterfacesAndAbstraction_Exercises.CollectionHierarchy_09;

import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IAddCollection;
import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IAddRemoveCollection;
import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IMyList;
import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models.AddCollection;
import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models.AddRemoveCollection;
import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models.MyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = reader.readLine().split("\\s+");
        int count = Integer.parseInt(reader.readLine());


        IAddCollection addCollection = new AddCollection();
        IAddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        IMyList addMyList = new MyList();

        for (String element : elements) {
            addCollection.add(element);
            addRemoveCollection.add(element);
            addMyList.add(element);
        }

        addCollection.printElements();
        System.out.println();
        addRemoveCollection.printElements();
        addMyList.printElements();


        addMyList.remove(count);
        addRemoveCollection.remove(count);


    }
}
