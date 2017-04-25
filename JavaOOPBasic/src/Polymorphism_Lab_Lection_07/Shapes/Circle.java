package Polymorphism_Lab_Lection_07.Shapes;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public final Double getRadius() {
        return radius;
    }

    protected void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(this.radius * 2 * 3.14);
    }

    @Override
    protected void calculateArea() {
        super.setArea(this.radius * this.radius * 3.14);
    }
}
