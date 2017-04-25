package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numVechiles = input.nextLine();
        String[] vechiles = numVechiles.split(" ");

        List<String> veh = new ArrayList<>();
        for (String v : vechiles) {
            veh.add(v);
        }

        String amountOfRequest = input.nextLine();

        int count = 0;

        while (!amountOfRequest.equals("End of customers!")) {

            String[] amountOfRequestSplit = amountOfRequest.split(" ");

            String vechType = amountOfRequestSplit[0];
            String vechile = vechType.substring(0, 1).toLowerCase();

            String vechileType = vechile.concat(amountOfRequestSplit[2]);

            boolean flag = true;
            int wantedIndex = -1;

            for (int i = 0; i < veh.size(); i++) {
                if (vechileType.equals(veh.get(i))) {

                    String firstVe = vechileType.substring(0, 1);
                    String ve = vechileType.substring(1);
                    long num = Long.parseLong(ve);

                    long sum = firstVe.charAt(0) * num;

                    wantedIndex = i;

                    System.out.printf("Yes, sold for %d$\n", sum);

                    flag = false;
                    count++;
                    veh.remove(vechileType);
                    break;
                }
            }

            if (flag) {
                System.out.println("No");
            }

            amountOfRequest = input.nextLine();
        }

        System.out.print("Vehicles left: ");
        for (int i = 0; i < veh.size(); i++) {
            if (i < veh.size() - 1) {
                System.out.print(veh.get(i) + ", ");
            } else {
                System.out.print(veh.get(i));
            }
        }

        System.out.println("\nVehicles sold: " + count);

    }
}

