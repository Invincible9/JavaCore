package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VendingMachine_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        String moneyInput = "";
        double totalMoney = 0;
        while (!"Start".equals(moneyInput = reader.readLine())) {
            if (moneyInput.equals("0.1") || moneyInput.equals("0.2")
                    || moneyInput.equals("0.5") || moneyInput.equals("1")
                    || moneyInput.equals("2")) {
                totalMoney += Double.parseDouble(moneyInput);
            } else {
                System.out.println(String.format("Cannot accept %s", moneyInput));
            }
        }

        String product = reader.readLine();

        while (!"End".equals(product)){

            switch (product){
                case "Nuts":
                    if(totalMoney >= 2.0){
                        totalMoney -= 2.0;
                        System.out.println("Purchased " + totalMoney);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":

                    break;
                case "Crisps":

                    break;
                case "Soda":

                    break;
                case "Coke":

                    break;

                    default:
                        System.out.println("Invalid product");
                        break;

            }


            product = reader.readLine();
        }

        System.out.printf("Change: %.2f\n", totalMoney);

    }
}
