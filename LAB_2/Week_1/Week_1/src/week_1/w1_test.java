public class w1_test {
    public static void main(String[] args) {
        double a = 9.0, b = -4.5;
        int x = 25, y = 4;

        // Basic Math Methods
        System.out.println("abs(b): " + Math.abs(b));
        System.out.println("max(a, b): " + Math.max(a, b));
        System.out.println("min(a, b): " + Math.min(a, b));
        System.out.println("sqrt(a): " + Math.sqrt(a));
        System.out.println("cbrt(a): " + Math.cbrt(a));
        System.out.println("pow(a, 2): " + Math.pow(a, 2));
        System.out.println("exp(1): " + Math.exp(1));
        System.out.println("log(a): " + Math.log(a));
        System.out.println("log10(a): " + Math.log10(a));

        // Rounding Methods
        System.out.println("round(b): " + Math.round(b));
        System.out.println("ceil(b): " + Math.ceil(b));
        System.out.println("floor(b): " + Math.floor(b));
        System.out.println("rint(a): " + Math.rint(a));

        // Trigonometric Methods
        System.out.println("sin(Math.PI/4): " + Math.sin(Math.PI / 4));
        System.out.println("cos(Math.PI/4): " + Math.cos(Math.PI / 4));
        System.out.println("tan(Math.PI/4): " + Math.tan(Math.PI / 4));

        // Hyperbolic Functions
        System.out.println("sinh(1): " + Math.sinh(1));
        System.out.println("cosh(1): " + Math.cosh(1));
        System.out.println("tanh(1): " + Math.tanh(1));

        // Random Number
        System.out.println("random(): " + Math.random());

        // Angle Conversion
        System.out.println("toDegrees(Math.PI): " + Math.toDegrees(Math.PI));
        System.out.println("toRadians(180): " + Math.toRadians(180));
    }
}