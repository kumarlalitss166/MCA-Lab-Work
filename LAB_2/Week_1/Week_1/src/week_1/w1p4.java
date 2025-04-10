 
public class w1p4 {
    public static void main(String[] args) {
        // Test values
        double[] testValues = {56.764, 36.432};

        for (double num : testValues) {
            // Performing operations
            double numRound = Math.round(num);
            double numCeil = Math.ceil(num);
            double numFloor = Math.floor(num);
            int numInteger = (int) num;

            // Displaying results
            System.out.println("\nFor num = " + num + ":");
            System.out.println("Rounded Value (numRound): " + numRound);
            System.out.println("Ceil Value (numCeil): " + numCeil);
            System.out.println("Floor Value (numFloor): " + numFloor);
            System.out.println("Integer Value (numInteger): " + numInteger);
        }
    }
}
