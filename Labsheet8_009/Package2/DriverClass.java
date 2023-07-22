package Package2;
import Package1.Shape;

public class DriverClass {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSides(3);
        triangle.setDimensions(5.0, 8.0);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        Circle circle = new Circle();
        circle.setSides(0);
        circle.setRadius(4.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
