package BankAccountTestClient;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mihail on 2/20/2017.
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
                    executeCreateCommand(accounts, commandSplit[1]);
                    break;
                case "Deposit":
                    executeDepositCommand(accounts, commandSplit);
                    break;
                case "Withdraw":
                    executeWithDrawCommand(accounts, commandSplit);
                    break;
                case "Print":
                    executePrintCommand(accounts, commandSplit);
                    break;
            }
            command = input.nextLine();
        }

    }

    private static void executePrintCommand(HashMap<Integer, BankAccount> accounts, String[] commandSplit) {
        Integer id = Integer.valueOf(commandSplit[1]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        BankAccount account = accounts.get(id);

        System.out.printf("Account %s, balance %.2f\n", account, account.getBalance());

    }

    private static void executeWithDrawCommand(HashMap<Integer, BankAccount> accounts, String[] commandSplit) {
        Integer id = Integer.valueOf(commandSplit[1]);
        Double amount = Double.valueOf(commandSplit[2]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        try {
            accounts.get(id).withdraw(amount);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }


    }

    private static void executeDepositCommand(HashMap<Integer, BankAccount> accounts, String[] commandSplit) {
        Integer id = Integer.valueOf(commandSplit[1]);
        Double amount = Double.valueOf(commandSplit[2]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        try {
            accounts.get(id).deposit(amount);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }


    private static void executeCreateCommand(HashMap<Integer, BankAccount> accounts, String s) {
        int id = Integer.valueOf(s);

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }


}
