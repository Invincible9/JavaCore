package EncapsulationExercises_Lection5.ClassBox_01;

/**
 * Created by Mihail on 2/24/2017.
 */
public class Box {
    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
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
