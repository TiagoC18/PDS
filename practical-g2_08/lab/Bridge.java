package lab;
// Abstraction
abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
}

// Concrete Abstraction
class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}

// Implementation
interface DrawingAPI {
    void drawCircle(int x, int y, int radius);
}

// Concrete Implementation
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API1: Drawing circle at (%d, %d) with radius %d%n", x, y, radius);
    }
}

class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("API2: Drawing circle at (%d, %d) with radius %d%n", x, y, radius);
    }
}

public class Bridge {
    public static void main(String[] args) {
        Shape circle1 = new Circle(1, 2, 3, new DrawingAPI1());
        Shape circle2 = new Circle(4, 5, 6, new DrawingAPI2());

        circle1.draw();
        circle2.draw();
    }
}
