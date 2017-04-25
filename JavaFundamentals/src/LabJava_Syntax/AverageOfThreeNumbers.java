package LabJava_Syntax;

import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        input.nextLine();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.printf("%.2f", average);
    }
}
