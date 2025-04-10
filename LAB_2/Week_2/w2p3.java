public class w2p3 {
    public static void main(String[] args) {
        double sum = 0.0;

        // Computing the sum of reciprocals from 1 to 10
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
        }

        // Displaying the result
        System.out.println("The sum of the reciprocals from 1 to 10 is: " + sum);
    }
}
