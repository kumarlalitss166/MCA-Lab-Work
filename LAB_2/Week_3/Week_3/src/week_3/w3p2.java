import java.util.Scanner;

public class w3p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting three digits from the user
        System.out.print("Enter first digit (0-9): ");
        int a = scanner.nextInt();
        System.out.print("Enter second digit (0-9): ");
        int b = scanner.nextInt();
        System.out.print("Enter third digit (0-9): ");
        int c = scanner.nextInt();

        System.out.println("All possible combinations:");
        System.out.println(a + "" + b + "" + c);
        System.out.println(a + "" + c + "" + b);
        System.out.println(b + "" + a + "" + c);
        System.out.println(b + "" + c + "" + a);
        System.out.println(c + "" + a + "" + b);
        System.out.println(c + "" + b + "" + a);

        scanner.close();
    }
}
