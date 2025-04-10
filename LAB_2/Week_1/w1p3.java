import java.util.Scanner;

public class w1p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking temperature in Fahrenheit as input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) / 1.8;

        // Displaying the result in tabular form
        System.out.println("\n-----------------------------");
        System.out.println("| Fahrenheit |   Celsius   |");
        System.out.println("-----------------------------");
        System.out.printf("|   %6.2f   |   %6.2f    |%n", fahrenheit, celsius);
        System.out.println("-----------------------------");

        scanner.close();
    }
}
