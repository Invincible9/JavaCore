package LabJava_Syntax;

import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = Double.parseDouble(input.nextLine());
        String tariff = input.nextLine();

        if (distance < 20) {
            if (tariff.equals("day")) {
                double result = (distance * 0.79) + 0.70;
                System.out.printf("%.2f", result);
            } else {
                double result = (distance * 0.90) + 0.70;
                System.out.printf("%.2f", result);
            }
        } else if (distance >= 20 && distance < 100) {
            System.out.printf("%.2f", distance * 0.09);
        } else if (distance >= 100) {
            System.out.printf("%.2f", distance * 0.06);
        }
    }
}
