import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mihail on 4/19/2017.
 */
public class shiftLeftAndRight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int move = Integer.parseInt(reader.readLine());
        String direction = reader.readLine();

        for (int i = 0; i < move; i++) {

            switch (direction){
                case "left":
                    leftShift(array);
                    break;
                case "right":
                    rightShift(array);
                    break;

            }
        }

        printElements(array);


    }

    private static void rightShift(int[] array) {
        int lastEl = array[array.length - 1];

        for (int j = array.length - 1; j >= 1; j--) {
            array[j] = array[j - 1];
        }

        array[0] = lastEl;
    }

    private static void printElements(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void leftShift(int[] array) {
        int firstEl = array[0];
        for (int j = 0; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        array[array.length-1] = firstEl;
    }




}
