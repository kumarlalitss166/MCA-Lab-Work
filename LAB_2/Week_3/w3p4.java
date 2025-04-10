import java.util.Scanner;

public class w3p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int num = scanner.nextInt();

        // Ensure the number is a 4-digit number
        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            // Extracting and printing each digit
            int d1 = num / 1000;        // First digit
            int d2 = (num / 100) % 10;  // Second digit
            int d3 = (num / 10) % 10;   // Third digit
            int d4 = num % 10;          // Fourth digit

            System.out.println("Digits:");
            System.out.println("First Digit:  " + d1);
            System.out.println("Second Digit: " + d2);
            System.out.println("Third Digit:  " + d3);
            System.out.println("Fourth Digit: " + d4);
        }

        scanner.close();
    }
}
