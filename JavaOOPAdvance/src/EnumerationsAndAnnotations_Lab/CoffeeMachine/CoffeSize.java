package EnumerationsAndAnnotations_Lab.CoffeeMachine;

/**
 * Created by Mihail on 3/28/2017.
 */
public enum CoffeSize {
    SMALL(50, 50), NORMAL(100, 75), DOUBLE(200, 100);

    private CoffeSize(int dosage, int price) {
    }
}
