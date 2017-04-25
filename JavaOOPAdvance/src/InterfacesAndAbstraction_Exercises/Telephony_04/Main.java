package InterfacesAndAbstraction_Exercises.Telephony_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/15/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        Smartphone smartphone = new Smartphone();
        for (String number : numbers) {
            try{
                System.out.println(smartphone.calls(number));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        for (String url : urls) {
            try{
                System.out.println(smartphone.browsing(url));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }


    }
}
