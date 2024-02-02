package Pr2actually1;

public class Circle extends Shape {
    protected double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        return "Circle's perimeter is " + getPerimeter() + " and it's area is " + getArea();
    }
}
