package Package1;

public class DriverClass {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSides(4);
        square.setSideLength(5.0);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.setSides(4);
        rectangle.setDimensions(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}
