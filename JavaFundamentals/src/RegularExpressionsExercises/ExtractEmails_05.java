package RegularExpressionsExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mihail on 4/23/2017.
 */
public class ExtractEmails_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("\\b(?<=^|[^\\.\\-\\_])[A-Za-z0-9][\\w+\\.\\-]+[A-Za-z0-9](?=[^\\.\\-\\_])@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");

        String info = reader.readLine();
        StringBuilder sb = new StringBuilder();
//        sb.append(" ").append(info);

        while (!info.equals("end")){
            Matcher matcher = pattern.matcher(sb.toString());

            while (matcher.find()){
                System.out.println(matcher.group());
            }

            info = reader.readLine().trim();
        }

    }
}
