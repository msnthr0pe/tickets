package Pr2actually1;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side) {
        length = side;
        width = side;
    }
    public Square(double side, String colour, boolean filled) {
        length = side;
        width = side;
        this.colour = colour;
        this.filled = filled;
    }
    public double getSide() {
        return length;
    }
    public void setSide(double side) {
        length = side;
    }
    @Override
    public void setWidth(double side) {
        width = side;
    }
    @Override
    public void setLength(double side) {
        length = side;
    }
    @Override
    public String toString() {
        return "Rectangle's perimeter is " + getPerimeter() + " and it's area is " + getArea();

    }

}