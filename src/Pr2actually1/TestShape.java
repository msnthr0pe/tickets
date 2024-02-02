package Pr2actually1;

public class TestShape {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); unable to get radius because object's class is Shape

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColour());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); unable to create object because class Shape is abstract
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColour());
        //System.out.println(s3.getLength()); unable to get length because object's class is Shape

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColour());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        //System.out.println(s4.getSide()); unable to get side because object's class is Shape

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColour());
        //System.out.println(r2.getSide()); unable to get side because object's class is Shape
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColour());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

}