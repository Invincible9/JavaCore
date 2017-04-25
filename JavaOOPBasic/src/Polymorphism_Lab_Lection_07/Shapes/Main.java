package Polymorphism_Lab_Lection_07.Shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.5);
        Shape rect = new Rectangle(5.0, 6.0);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rect);

        for (Shape shape : shapeList) {
            System.out.println(shape.getArea());
        }



    }
}
