package JavaIntroduction;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loses = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        for(int i = 1; i <= loses; i++)
        {
            if(i % 2 == 0)
                sum += headset;
            if(i % 3 == 0)
                sum += mouse;
            if(i % 6 == 0)
                sum += keyboard;
            if(i % 12 == 0)
                sum += display;
        }
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
