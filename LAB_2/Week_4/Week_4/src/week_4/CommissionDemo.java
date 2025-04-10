import java.util.Scanner;

// Commission class
class Commission {
    private double sale;

    // Constructor
    public Commission(double sale) {
        this.sale = sale;
    }

    // Method to calculate commission
    public double calculateCommission() {
        if (sale < 500) {
            return sale * 0.02;
        } else if (sale <= 5000) {
            return sale * 0.05;
        } else {
            return sale * 0.08;
        }
    }
}

// Demo class to test Commission class
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter sales amount: ");
        double sale = scanner.nextDouble();
        
        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sale);
            double commissionAmount = commission.calculateCommission();
            System.out.println("Commission: Rs. " + commissionAmount);
        }
        
        scanner.close();
    }
}