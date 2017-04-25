package IteratorsAndComperators_Exercises.StackIterator_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/23/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String info = reader.readLine();

        StackIterator stackIterator = new StackIterator();

        while(!info.equals("END")){
            String[] commands = info.trim().split("[,\\s+]");

            switch (commands[0]){
                case "Push":
                    for (int i = 1; i < commands.length; i++) {
                        if(!commands[i].equals("")) {
                            stackIterator.push(Integer.parseInt(commands[i]));
                        }
                    }
                    break;
                case "Pop":
                    try {
                        stackIterator.pop();
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
            info = reader.readLine();
        }

        List<Integer> list = new ArrayList<>();

        while(stackIterator.iterator().hasNext()){
            list.add((int) stackIterator.peek());
            System.out.println(stackIterator.iterator().next());
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
