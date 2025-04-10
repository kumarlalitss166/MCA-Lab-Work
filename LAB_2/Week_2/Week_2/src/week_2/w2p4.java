import java.util.Scanner;

public class w2p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (N): ");
        int n = scanner.nextInt();

        int sum = 0;
        int currentEven = 2;

        // Calculating the sum of the first N even numbers
        for (int i = 1; i <= n; i++) {
            sum += currentEven;
            currentEven += 2;
        }

        // Displaying the result
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}