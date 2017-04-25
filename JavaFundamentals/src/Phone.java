import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 4/4/2017.
 */
public class Phone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> numbers = Arrays.stream(reader.readLine().trim().split("\\s+")).distinct().collect(Collectors.toList());
        List<String> names = Arrays.stream(reader.readLine().trim().split("\\s+")).distinct().collect(Collectors.toList());

        String info = reader.readLine();

        while (!info.equals("done")) {

            List<String> infoSplit = Arrays.stream(info.trim().split("\\s+")).collect(Collectors.toList());
            String searchingWord = infoSplit.get(1);

            switch (infoSplit.get(0)) {
                case "call":
                    if (Character.isDigit(searchingWord.charAt(searchingWord.length() - 1))) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (searchingWord.equals(numbers.get(i))) {
                                System.out.println("calling " + names.get(i) + "...");

                                long sum = sumDigit(searchingWord);
                                if (sum % 2 == 1) {
                                    System.out.println("no answer");
                                } else {
                                    System.out.printf("call ended. duration: %02d:%02d\n", sum / 60, (sum % 60));
                                }
                            }
                        }
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            if (searchingWord.equals(names.get(i))) {
                                System.out.println("calling " + numbers.get(i) + "...");

                                long sum = sumDigit(numbers.get(i));
                                if (sum % 2 == 1) {
                                    System.out.println("no answer");
                                } else {
                                    System.out.printf("call ended. duration: %02d:%02d\n", sum / 60, (sum % 60));
                                }
                            }
                        }
                    }
                    break;
                case "message":
                    if (Character.isDigit(searchingWord.charAt(searchingWord.length() - 1))) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (searchingWord.equals(numbers.get(i))) {
                                System.out.println("sending sms to " + names.get(i) + "...");

                                long sum = sumDigit(searchingWord);
                                if (sum % 2 == 1) {
                                    System.out.println("busy");
                                } else {
                                    System.out.println("meet me there");
                                }
                            }
                        }
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            if (searchingWord.equals(names.get(i))) {
                                System.out.println("sending sms to " + numbers.get(i) + "...");

                                long sum = sumDigit(numbers.get(i));

                                if (sum % 2 == 1) {
                                    System.out.println("busy");
                                } else {
                                    System.out.println("meet me there");
                                }
                            }
                        }
                    }
                    break;
            }
            info = reader.readLine();
        }
    }

    public static long sumDigit(String text) {
        long sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(text.charAt(i)));
            }
        }
        return sum;
    }
}