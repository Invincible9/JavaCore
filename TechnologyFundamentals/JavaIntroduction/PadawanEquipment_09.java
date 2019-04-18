package JavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadawanEquipment_09 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(
                System.in
        ));

        /*
        •	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
•	The count of students – integer in range [0…100]
•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
•	The price of belts for a single belt – floating-point number in range [0.00…100.00]

         */

        double amountOfMoney = Double.parseDouble(reader.readLine());
        int countOfStudents = Integer.parseInt(reader.readLine());
        double lightsaber = Double.parseDouble(reader.readLine());
        double robesPrice = Double.parseDouble(reader.readLine());
        double beltsPrice = Double.parseDouble(reader.readLine());

        double sum = (lightsaber * Math.ceil(countOfStudents * 1.1)) + (robesPrice * countOfStudents)
                + beltsPrice * (countOfStudents - (countOfStudents / 6));

        if(sum <= amountOfMoney){
            System.out.println(String.format("The money is enough - it would cost %.2flv.", sum));
        }else{
            System.out.println(String.format("Ivan Cho will need %.2flv more.", sum - amountOfMoney));
        }



    }

}
