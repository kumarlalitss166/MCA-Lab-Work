import java.util.Scanner;

public class w1p2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform the operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (num2 != 0) ? (double) num1 / num2 : 0; // Avoid division by zero
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
