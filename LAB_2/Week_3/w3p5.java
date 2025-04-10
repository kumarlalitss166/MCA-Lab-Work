import java.awt.Rectangle;

public class w3p5 {
    public static void main(String[] args) {
        // Define two rectangles (x, y, width, height)
        Rectangle r1 = new Rectangle(10, 10, 50, 50);
        Rectangle r2 = new Rectangle(30, 30, 50, 50);

        // Compute the intersection
        Rectangle r3 = r1.intersection(r2);

        // Print the rectangles
        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);
        System.out.println("Intersection: " + r3);

        // Check if there is no intersection
        if (r3.isEmpty()) {
            System.out.println("The rectangles do not overlap.");
        }
    }
}
