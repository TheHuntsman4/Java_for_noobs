package Package2;
import Package1.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public void setDimensions(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return sides * base;
    }
}
