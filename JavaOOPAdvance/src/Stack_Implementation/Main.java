package Stack_Implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) {

            Stack stack = new ArrayBasedStack();
            //stack.pop();
            System. out .println(stack.isEmpty());
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);

            while(!stack.isEmpty()){
                System.out.println(stack.top());
            }


//            System. out .println(stack.top());
//            System. out .println(stack.size());
//            System. out .println(stack.pop());
//            System. out .println(stack.isEmpty());
//            System. out .println(stack.pop());
        }



}
