package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        int count = 0;
        String word = reader.readLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isVowel(char symbol) {
        switch (symbol){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
              return true;
        }

        return false;
    }
}
