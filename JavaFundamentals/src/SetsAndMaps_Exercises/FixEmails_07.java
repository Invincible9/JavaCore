package SetsAndMaps_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * Created by Mihail on 4/6/2017.
 */
public class FixEmails_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, String> personEmails = new LinkedHashMap<>();

        while (true){
            String name = reader.readLine();

            if(name.equals("stop")){
                break;
            }

            String email = reader.readLine();

            int index = email.lastIndexOf(".");
            String searchingEmailExtension = email.substring(index + 1);

            if(!searchingEmailExtension.equals("us") && !searchingEmailExtension.equals("uk") && !searchingEmailExtension.equals("com")){
                if(!personEmails.containsKey(name)){
                    personEmails.put(name, email);
                }
            }
        }

        for (String key : personEmails.keySet()) {
            System.out.println(key + " -> " + personEmails.get(key));
        }
    }
}
