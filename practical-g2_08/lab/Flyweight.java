package lab;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Shape {
    void draw(int x, int y);
}

// Concrete Flyweight
class Circle implements Shape {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a circle with color " + color + " at (" + x + ", " + y + ")");
    }
}

// Flyweight Factory
class ShapeFactory {
    private static final Map<Color, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}

public class Flyweight {
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Color color = COLORS[(int) (Math.random() * COLORS.length)];
            Shape circle = ShapeFactory.getCircle(color);
            circle.draw(getRandomX(), getRandomY());
        }
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
