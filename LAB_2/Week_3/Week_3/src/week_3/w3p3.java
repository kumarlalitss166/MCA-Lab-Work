import java.util.Scanner;

public class w3p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting four numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = scanner.nextInt();

        // Calculating sum and product
        int sum = num1 + num2 + num3 + num4;
        int product = num1 * num2 * num3 * num4;

        // Displaying results
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Product of numbers: " + product);

        scanner.close();
    }
}
