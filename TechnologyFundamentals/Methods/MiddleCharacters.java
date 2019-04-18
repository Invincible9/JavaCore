package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiddleCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String text = reader.readLine();

        if(text.length() % 2 == 0){
            int index = (text.length() / 2) - 1;
            System.out.println(text.charAt(index) + "" + text.charAt(text.length() / 2));
        }else{
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
