package LabJava_Syntax;

import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.nextLine();
        String lastName = input.nextLine();

        if (firstName.isEmpty()) {
            firstName = "*****";
        }

        if(lastName.isEmpty()){
            lastName = "*****";
        }

        System.out.printf("Hello, %s %s!", firstName, lastName);
    }

}
