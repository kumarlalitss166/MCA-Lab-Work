package week_8;
public class test {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception.");
        }
    }
}