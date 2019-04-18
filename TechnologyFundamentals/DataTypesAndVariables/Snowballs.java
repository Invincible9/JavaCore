package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snowballs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        long numberOfSnowballs = Integer.parseInt(reader.readLine());

        long snowballValueMax = 0;
        int snowballSnowOutput = 0;
        int snowballTimeOutput = 0;
        int snowballQualityOutput = 0;


        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(reader.readLine());
            int snowballTime = Integer.parseInt(reader.readLine());
            int snowballQuality = Integer.parseInt(reader.readLine());

            long snowballValue = (long) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if(snowballValue > snowballValueMax){
                snowballValueMax = snowballValue;
                snowballSnowOutput = snowballSnow;
                snowballTimeOutput = snowballTime;
                snowballQualityOutput = snowballQuality;
            }
        }

        System.out.println(String.format(
                "%d : %d = %d (%d)", snowballSnowOutput, snowballTimeOutput,
                snowballValueMax, snowballQualityOutput
        ));

    }
}
