package StaticIdAndInterestRate;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mihail on 2/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, BankAccount> accounts = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        while (!command.equals("End")) {
            String[] commandSplit = command.split("\\s+");
            String commandType = commandSplit[0];

            switch (commandType) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    System.out.printf("Account %s created%n", account);
                    break;
                case "Deposit":
                    executeDepositCommand(accounts, commandSplit);
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(commandSplit[1]));
                    break;
                case "GetInterest":
                    executeGetInterestCommand(accounts, commandSplit);
                    break;
            }
            command = input.nextLine();
        }

    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandSplit) {
        int id = Integer.valueOf(commandSplit[1]);

        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            double amount = Integer.valueOf(commandSplit[2]);
            BankAccount account = accounts.get(id);
            account.deposit(amount);
            System.out.printf("Deposited %.0f to %s%n",amount, account);
        }
    }

    private static void executeGetInterestCommand(HashMap<Integer, BankAccount> accounts, String[] commandSplit) {
        int id = Integer.valueOf(commandSplit[1]);

        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            Integer years = Integer.valueOf(commandSplit[2]);
            BankAccount account = accounts.get(id);
            double interest = account.getInterestRate(years);

            System.out.printf("%.2f%n", interest);
        }
    }

}