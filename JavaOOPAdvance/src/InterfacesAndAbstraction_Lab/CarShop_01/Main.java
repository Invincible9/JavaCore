package InterfacesAndAbstraction_Lab.CarShop_01;

/**
 * Created by Mihail on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");

                System.out.println(String.format(
                        "%s is %s color and have %s horse power",
                        seat.getModel(),
                        seat.getColor(),
                        seat.getHorsePower()));
        System.out.println(seat.toString());

    }
}
