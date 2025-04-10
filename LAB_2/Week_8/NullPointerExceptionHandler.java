public class NullPointerExceptionHandler {

    // Version A: Using try-catch to handle NullPointerException
    public static void versionA() {
        try {
            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Version A: Caught a NullPointerException - " + e.getMessage());
        }
    }

    // Version B: Preventing NullPointerException using null checks
    public static void versionB() {
        String str = null;
        if (str != null) {
            System.out.println("String length: " + str.length());} 
            else {
            System.out.println("Version B: Null value detected, avoiding NullPointerException.");
        }
    }

    // Version C: Using Optional to handle null values gracefully (Java 8+)
    public static void versionC() {
        java.util.Optional<String> optionalStr = java.util.Optional.ofNullable(null);
        System.out.println("Version C: String length - " + optionalStr.map(String::length).orElse(0));
    }

    public static void main(String[] args) {
        System.out.println("Executing Version A:");
        versionA();
        
        System.out.println("\nExecuting Version B:");
        versionB();
        
        System.out.println("\nExecuting Version C:");
        versionC();
    }
}
