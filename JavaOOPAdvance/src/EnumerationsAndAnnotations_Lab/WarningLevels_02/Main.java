package EnumerationsAndAnnotations_Lab.WarningLevels_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String searchingLevel = reader.readLine();

        Logger logger = new Logger(Importance.valueOf(searchingLevel));

        String info = reader.readLine();


        while (!info.equals("END")) {
            String[] infoSplit = info.split(": ");

            logger.records(new Message(Importance.valueOf(infoSplit[0]), infoSplit[1]));

            info = reader.readLine();
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }

    }
}
