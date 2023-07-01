abstract class Shape{
    String color;
    public abstract double area();
    public abstract String toString();
    public abstract double permiter();
    public String getColor(){
        return color;
    }
}

class Circle extends Shape{
    double radius;
    public double area(){
        return (22/7*radius*radius);
    }

    public String toString(){
        return color;
    }

    public double permiter(){
        return (2*22/7*radius);
    }
}

class Rectagle extends Shape{
    double length;
    double width;

    public double area(){
        return (length*width);
    }

    public String toString(){
        return color;
    }

        public double permiter(){
        return (2*(length+width));
    }
}