import java.util.Scanner;

// Class to track odd and even numbers
class OddAndEven {
    private int countOfOdd;
    private int countOfEven;

    // Method to add a number and update the counts
    public void addNumber(int number) {
        if (number % 2 == 0) {
            countOfEven++;
        } else {
            countOfOdd++;
        }
    }

    // Overriding toString method to display counts
    @Override
    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even: " + countOfEven;
    }
}

// Class to test OddAndEven functionality
public class TestOddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OddAndEven counter = new OddAndEven();

        System.out.println("Enter numbers (or 'Q' to quit):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                counter.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or 'Q' to quit.");
            }
        }

        scanner.close();
        System.out.println(counter);
    }
}
