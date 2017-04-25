package OpenClosedAndLiskovPrinciple_Lab.P03_GraphicEditor;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Buro on 3.4.2017 г..
 */
public class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape instanceof Shape) {
            System.out.println("I'm Shape");
        } else if (shape instanceof Circle) {
            System.out.println("I'm Circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("I'm Rectangle");
        }
    }
}
