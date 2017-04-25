package MultidimensionalArraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Mihail on 2/19/2017.
 */
public class ToTheStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String info = input.nextLine();

        List<String> starName = new ArrayList<>();
        List<Double> starX = new ArrayList<>();
        List<Double> starY = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] coord = info.split(" ");

            String nameIland = coord[0];
            double coordX = Double.parseDouble(coord[1]);
            double coordY = Double.parseDouble(coord[2]);

            starName.add(nameIland);
            starX.add(coordX);
            starY.add(coordY);

            info = input.nextLine();
        }

        String[] curCoord = info.split(" ");
        double X = Double.parseDouble(curCoord[0]);
        double Y = Double.parseDouble(curCoord[1]);

        int turns = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= turns; i++) {
            boolean foundStar = false;
            for (int j = 0; j < 3; j++) {
                if (isInsideStar(X, Y, starX.get(j), starY.get(j))) {
                    System.out.println(starName.get(j).toLowerCase());
                    foundStar = true;
                    break;
                }
            }
            if (!foundStar) {
                System.out.println("space");
            }
            Y++;
        }
    }

    public static boolean isInsideStar(double nX, double nY, double sX, double sY) {
        if ((nX <= sX + 1 && nX >= sX - 1) && (nY <= sY + 1 && nY >= sY - 1)) {
            return true;
        } else {
            return false;
        }
    }
}
