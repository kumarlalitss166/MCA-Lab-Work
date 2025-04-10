import java.util.Scanner;

// Class representing a Circle
class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    // Constructor
    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute perimeter
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean isPointInside(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
        return distance <= radius;
    }
}

// Main class to test Circle class
public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter radius of the circle (negative to exit): ");
            double radius = scanner.nextDouble();
            
            if (radius < 0) {
                break;
            }
            
            System.out.print("Enter x-coordinate of the center: ");
            double centerX = scanner.nextDouble();
            System.out.print("Enter y-coordinate of the center: ");
            double centerY = scanner.nextDouble();
            
            Circle circle = new Circle(radius, centerX, centerY);
            
            System.out.println("Circle Area: " + circle.computeArea());
            System.out.println("Circle Perimeter: "+ circle.computePerimeter());
            
            System.out.print("Enter x-coordinate of the point: ");
            double x = scanner.nextDouble();
            System.out.print("Enter y-coordinate of the point: ");
            double y = scanner.nextDouble();
            
            if (circle.isPointInside(x, y)) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }
        }
        
        scanner.close();
        System.out.println("Program terminated.");
    }
}
