package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/24/2017.
 */
public class PhoneNumbers_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("([A-Z][a-z]+)(?:[^A-Za-z\\+]+)([\\d+ ()\\/.\\- ]+)");

        String info = reader.readLine();

        while (!info.equals("end")){

            Matcher matcher = pattern.matcher(info);

            while (matcher.find()){
                System.out.println(matcher.group());
//                String numbers = matcher.group(2);
//                if(Character.isDigit(numbers)){
//
//                }
            }


            info = reader.readLine();
        }


    }
}
