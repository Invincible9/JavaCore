package InheritanceExercises_Exercises_Lection_06.BookShop_02;

/**
 * Created by Mihail on 3/1/2017.
 */
public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String author, String title, Double price) {
        super(author, title, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + super.getPrice() * 0.3;
    }

}
