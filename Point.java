package ass;

// Base class
class Point {
    public int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point -> x: " + x + ", y: " + y);
    }
}

// Subclass
class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super(); // Call Point()
        this.color = "Black";
    }

    public ColorPoint(String color) {
        super(); // Coordinates default to 0,0
        this.color = color;
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("ColorPoint -> x: " + x + ", y: " + y + ", color: " + color);
    }
}

// Main class
public class SwtAQ1 {
    public static void main(String[] args) {
        Point p1 = new Point();
        ColorPoint cp1 = new ColorPoint();

        Point p2 = new Point(5, 10);
        ColorPoint cp2 = new ColorPoint(3, 4, "Red");

        // Display the points
        p1.display();
        cp1.display();
        p2.display();
        cp2.display();
    }
}
