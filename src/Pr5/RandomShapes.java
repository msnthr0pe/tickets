package Pr5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class RandomShapes extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Random random = new Random();

    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WINDOW_WIDTH-100);
            int y = random.nextInt(WINDOW_HEIGHT-100);
            int widthOrRadius = random.nextInt(50) + 20;
            int height = random.nextInt(50) + 20;

            if (random.nextBoolean()) {
                shapes[i] = new Circle(randomColor, x, y, widthOrRadius);
            } else {
                shapes[i] = new Rectangle(randomColor, x, y, widthOrRadius, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.add(new RandomShapes());
        frame.setVisible(true);
    }
}