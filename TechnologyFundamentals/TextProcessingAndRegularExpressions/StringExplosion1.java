package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        StringBuilder text = new StringBuilder(reader.readLine());

        int skipElements = 0;
        for (int i = 0; i < text.length(); i++) {

            if(text.charAt(i) == '>'){
                skipElements += Integer.parseInt(String.valueOf(text.charAt(i + 1)));
            }

            while (skipElements > 0){
                skipElements--;
                text.deleteCharAt(i+1);

                if(i + 1 >= text.length() || text.charAt(i) == '>'){
                    break;
                }
            }
        }

        System.out.println(text);
    }
}
