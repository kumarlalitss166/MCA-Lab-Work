public class w2p2 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        System.out.println("-----------------------------");

        for (int i = 1; i <= 5; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}
