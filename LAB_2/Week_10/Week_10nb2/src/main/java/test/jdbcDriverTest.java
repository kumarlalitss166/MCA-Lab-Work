package test;
public class jdbcDriverTest {
    public static void main(String[] args){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver NOT found! Check your setup.");
        }
    }
}