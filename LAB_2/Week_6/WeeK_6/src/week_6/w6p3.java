package week_6;

import java.util.Arrays;
import java.util.Scanner;

public class w6p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input of three strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter third string: ");
        String str3 = scanner.nextLine();
        scanner.close();
        // Storing in array and sorting
        String[] strings = {str1, str2, str3};
        Arrays.sort(strings);
        // Displaying sorted strings
        System.out.println("Strings in lexicographical order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
