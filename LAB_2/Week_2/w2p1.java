import java.util.Scanner;

public class w2p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();

        int evenCount = 0, oddCount = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nCount of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);

        scanner.close();
    }
}
