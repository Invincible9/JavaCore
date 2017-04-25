package Polymorphism_Lab_Lection_07.Shapes;

/**
 * Created by Mihail on 3/2/2017.
 */
public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected Shape() {
    }

    public Double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();


}
