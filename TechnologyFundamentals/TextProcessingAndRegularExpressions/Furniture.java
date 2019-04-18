package TextProcessingAndRegularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );


        String input = reader.readLine();

        System.out.println("Bought furniture:");
        double totalMoneySpend = 0;
        while (!input.equals("Purchase")){

            Pattern pattern =
                    Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)");
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                System.out.println(matcher.group("name"));
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalMoneySpend += price * quantity;
            }

            input = reader.readLine();
        }

        System.out.println(String.format("Total money spend: %.2f", totalMoneySpend));
    }
}
