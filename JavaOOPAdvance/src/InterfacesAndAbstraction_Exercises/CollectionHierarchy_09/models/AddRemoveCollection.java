package InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models;

import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IMyList;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Mihail on 3/19/2017.
 */
public class AddRemoveCollection extends AddCollection implements IMyList {

    private Deque<String> stack;

    public AddRemoveCollection() {
        this.stack = new ArrayDeque<>();
    }

    @Override
    public void add(String element) {
        this.stack.push(element);
    }

    @Override
    public int Used() {
        return this.stack.size();
    }

    @Override
    public void printElements() {
        for (int i = 0; i < this.stack.size(); i++) {
            if(this.stack.size() > 1) {
                System.out.print(0 + " ");
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }

    @Override
    public void remove(int count) {
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.print(stack.pop() + " ");

            if(this.stack.isEmpty()){
                break;
            }
        }

    }
}
