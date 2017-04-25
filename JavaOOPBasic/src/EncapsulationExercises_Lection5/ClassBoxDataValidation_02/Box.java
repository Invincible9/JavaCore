package EncapsulationExercises_Lection5.ClassBoxDataValidation_02;

/**
 * Created by Mihail on 2/24/2017.
 */
public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(Double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWidth(Double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setHeight(Double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private double volume() {
        return length * width * height;
    }

    private double surfaceArea() {
        return ((2 * length * width) + (2 * length * height) + (2 * width * height));
    }

    private double lateralSurfaceArea() {
        return ((2 * length * height) + (2 * width * height));
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f",
                this.surfaceArea(), this.lateralSurfaceArea(), this.volume());
    }

}
