package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation_03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        int groupNumber = Integer.parseInt(reader.readLine());

        String condition = reader.readLine().toLowerCase();
        String day = reader.readLine().toLowerCase();

        if(groupNumber >= 100 && condition.equals("business")){
            groupNumber -= 10;
        }

        double totalPrice = 0.0;

        switch (day){
            case "friday":
                if(condition.equals("students")){
                    totalPrice = groupNumber * 8.45;
                }else if(condition.equals("business")){
                    totalPrice = groupNumber * 10.90;
                }else if(condition.equals("regular")){
                    totalPrice = groupNumber * 15;
                }
                break;
            case "saturday":
                if(condition.equals("students")){
                    totalPrice = groupNumber * 9.80;
                }else if(condition.equals("business")){
                    totalPrice = groupNumber * 15.60;
                }else if(condition.equals("regular")){
                    totalPrice = groupNumber * 20;
                }
                break;
            case "sunday":
                if(condition.equals("students")){
                    totalPrice = groupNumber * 10.46;
                }else if(condition.equals("business")){
                    totalPrice = groupNumber * 16;
                }else if(condition.equals("regular")){
                    totalPrice = groupNumber * 22.50;
                }
                break;
            default:
                break;
        }

        if(groupNumber >= 30 && condition.equals("students")){
            totalPrice -= totalPrice * 0.15;
        }else if((groupNumber >= 10 && groupNumber <= 20) && condition.equals("regular")){
            totalPrice -= totalPrice * 0.05;
        }

        System.out.println(String.format("Total price: %.2f", totalPrice));


    }
}
