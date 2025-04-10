package week_6;

// Common interface for shapes
interface Drawable {
    void draw();
    double calculateArea();
}

// Base class Shape
abstract class Shape {
    String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

// Circle class implementing Drawable and extending Shape
class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Drawable and extending Shape
class Rectangle extends Shape implements Drawable {
    private double length, width;
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to test
public class w6p4{
    public static void main(String[] args) {
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(4, 6);
        
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        
        rectangle.draw();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
