package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ages_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        int age = Integer.parseInt(reader.readLine());

        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        } else if (age >= 3 && age <= 13) {
            System.out.println("child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        } else if (age >= 66) {
            System.out.println("elder");
        }

    }
}
