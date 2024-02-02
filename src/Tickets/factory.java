package Tickets;

interface AbstractShape {
    Integer area = 5;
    void draw();
    Integer getArea();
}

interface AbstractFactory {
    Circle createCircle(Integer area);
    Rectangle createRectangle(Integer area);

}

class Circle implements AbstractShape {
    Integer area;
    public Circle(Integer area) {
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }

    @Override
    public Integer getArea() {
        return area;
    }
}

class Rectangle implements AbstractShape {
    Integer area;
    public Rectangle(Integer area) {
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }

    @Override
    public Integer getArea() {
        return area;
    }
}

class ConcreteFactory implements AbstractFactory {

    @Override
    public Circle createCircle(Integer area) {
        return new Circle(area);
    }

    @Override
    public Rectangle createRectangle(Integer area) {
        return new Rectangle(area);
    }

}
public class factory {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Circle circle = factory.createCircle(7);
        Rectangle rectangle = factory.createRectangle(6);

        circle.draw();
        System.out.println(circle.getArea());
        rectangle.draw();
        System.out.println(rectangle.getArea());
    }
}
