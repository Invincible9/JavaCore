package LabJava_Syntax;

import java.util.Scanner;

/**
 * Created by Mihail on 1/16/2017.
 */
public class CalculateTriangleAreaMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double calcTriangleArea = calcArea(base, height);

        System.out.printf("Area = %.2f", calcTriangleArea);
    }

    public static double calcArea(double width, double height) {
        return (width * height) / 2;
    }
}

