package LabJava_Syntax;

import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class ReadInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstWord = input.next("\\w+");
        String secondWord = input.next("\\w+");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        input.nextLine();
        String thirdWord = input.nextLine();

        int sumNumbers = firstNumber + secondNumber + thirdNumber;

        System.out.println(firstWord + " " + secondWord + " " +  thirdWord + " " + sumNumbers);
    }

}
