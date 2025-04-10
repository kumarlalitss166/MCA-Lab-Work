package week_2;

public class w2_test {
    public static void main(String[] args) {
        int rows = 6, num = 1; // Change rows as needed

	System.out.println("Floyd's Triangle");        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
	    System.out.println();
	}
	System.out.println();
	
	System.out.println("Binary Floyd's Triangle");
	for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2) + " ");
            }
		System.out.println();
	}
    }
}
