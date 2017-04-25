package Inheritance_Lab_Lection_06.StackOfStrings_06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 2/28/2017.
 */
public class StackOfStrings {

    private List<String> data;

    public StackOfStrings(){
        this.data = new ArrayList<>();
    }

    public void push(String item){
        this.data.add(item);
    }

    public String pop(){
        return  this.data.remove(this.data.size()- 1);
    }

    public String peek(){
        return this.data.get(this.data.size()- 1);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }


}
