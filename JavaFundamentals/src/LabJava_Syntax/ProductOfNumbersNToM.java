package LabJava_Syntax;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class ProductOfNumbersNToM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int lastNumber = input.nextInt();

        BigInteger res = BigInteger.ONE;

        int counter = lastNumber;
        do {
            BigInteger numberBig = new BigInteger("" + counter);
            res = res.multiply(numberBig);
            counter--;
        } while (counter >= firstNumber);

        System.out.printf("product[%d..%d] = %d\n", firstNumber, lastNumber, res);
    }
}
