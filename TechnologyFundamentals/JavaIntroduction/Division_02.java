package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division_02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        int number = Integer.parseInt(reader.readLine());

        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (number % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if (number % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else if (number % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
