import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 4/4/2017.
 */
public class PhoneBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");
        String[] names = reader.readLine().split("\\s+");

        String searchingNmae = reader.readLine();

        while (!searchingNmae.equals("done")) {

            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(searchingNmae)) {
                    System.out.println(searchingNmae + " -> " + numbers[i]);
                }
            }
            searchingNmae = reader.readLine();
        }

    }
}
