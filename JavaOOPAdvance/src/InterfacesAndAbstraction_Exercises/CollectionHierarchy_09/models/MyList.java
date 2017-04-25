package InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.models;

import InterfacesAndAbstraction_Exercises.CollectionHierarchy_09.interfaces.IMyList;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Mihail on 3/19/2017.
 */
public class MyList implements IMyList {

    private Deque<String> queue;

    public MyList() {
        this.queue = new ArrayDeque<>();
    }

    @Override
    public void add(String element) {
        this.queue.offer(element);
    }

    @Override
    public void printElements() {
        for (int i = 0; i < this.queue.size(); i++) {
            if(this.queue.size() != 1) {
                System.out.print(0 + " ");
            }else{
                System.out.print(0);
            }
        }
        System.out.println();
    }

    @Override
    public int Used() {
        return this.queue.size();
    }

    @Override
    public void remove(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(queue.remove() + " ");

            if (this.queue.isEmpty()) {
                break;
            }
        }

    }


}
