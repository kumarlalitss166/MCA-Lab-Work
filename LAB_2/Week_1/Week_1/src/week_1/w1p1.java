import java.util.Scanner;

public class w1p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student details as input
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Roll Number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter Student Address: ");
        String address = scanner.nextLine();

        // Displaying student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);

        scanner.close();
    }
}
	