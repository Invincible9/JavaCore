package Polymorphism_Lab_Lection_07.Shapes;

/**
 * Created by Mihail on 3/2/2017.
 */
public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.calculateArea();
        this.calculatePerimeter();
    }

    public Double getHeight() {
        return height;
    }

    protected void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    protected void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2 * this.height + 2 * this.width);
    }

    @Override
    public void calculateArea() {
        super.setArea(this.height * this.width);
    }
}
