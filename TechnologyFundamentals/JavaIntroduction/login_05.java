package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class login_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        StringBuilder word = new StringBuilder(reader.readLine());

        int count = 1;
        while (true){

            if(count++ == 4){
                System.out.println(String.format("User %s blocked!", word));
                break;
            }

//            count++;
            StringBuilder next = new StringBuilder(reader.readLine());

            if(next.reverse().toString().contentEquals(word)){
                System.out.println(String.format("User %s logged in.", word));
                break;
            }

            System.out.println("Incorrect password. Try again.");

        }
    }
}
