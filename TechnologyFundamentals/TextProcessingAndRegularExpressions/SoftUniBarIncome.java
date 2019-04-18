package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String regex =
                "%(?<customer>[A-Z][a-z]*)%(?:[^|$%.]*)" +
                        "<(?<product>[^<>]+)>(?:[^|$%.]*)" +
                        "\\|(?<count>\\d+)\\|(?:[^|$%.]*?)" +
                        "(?<price>[-+]?\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);


        String input = "";
        double totalIncome = 0.0;

        while (!"end of shift".equals(input = reader.readLine())){

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double totalPrice = count * price;
                System.out.println(String.format("%s: %s - %.2f",
                        customer, product,totalPrice));

                totalIncome += totalPrice;
            }
        }

        System.out.println(String.format("Total income: %.2f", totalIncome));

    }
}
